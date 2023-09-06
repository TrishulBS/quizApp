package com.trishul.quizapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trishul.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
