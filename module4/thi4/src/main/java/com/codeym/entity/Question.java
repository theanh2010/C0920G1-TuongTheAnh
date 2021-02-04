package com.codegym.thi4.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Question implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name must not be Blank")
    private String title;

    @NotBlank(message = "question must not be Blank")
    private String question;

    @NotBlank(message = "answer must not be Blank")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionType questionType;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @PastOrPresent
    private Date dateCreate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status;


    public Question() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateOfBirth() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Question.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Question question = (Question) target;
        LocalDate today = LocalDate.now();
        Date birth = question.getDateCreate();
        if (birth == null) {
            errors.rejectValue("dateOfBirth", "DateNotNull");
        } else {
            LocalDate birthLocal =  birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (Period.between(birthLocal, today).getYears()<18) {
                errors.rejectValue("dateOfBirth", "DateCustomer");
            }
        }
        //        ValidationUtils.rejectIfEmpty(errors, "name", "mess.empty");

    }
}
