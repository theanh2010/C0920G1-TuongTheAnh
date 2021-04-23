package com.codeym.service.impl;

import com.codeym.entity.Question;
import com.codeym.repository.QuestionRepository;
import com.codeym.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public Question findById(int id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> findAllByQuestionType(String questionType) {
        return questionRepository.findAllByQuestionType(questionType);
    }

    @Override
    public List<Question> findByAllTitle(String title) {
        return questionRepository.findAllByTitle(title);
    }
}
