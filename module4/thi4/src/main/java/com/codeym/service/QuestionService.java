package com.codeym.service;

import com.codeym.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionService {

    Page<Question> findAll(Pageable pageable);

    void save(Question question);

    Question findById(int id);

    void deleteById(int id);

    List<Question> findAllByQuestionType(String questionType);

    List<Question> findByAllTitle(String title);
}

