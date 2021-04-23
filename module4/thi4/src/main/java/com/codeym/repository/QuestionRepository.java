package com.codeym.repository;

import com.codeym.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findAllByTitle(String title);

    List<Question> findAllByQuestionType(String questionType);

}
