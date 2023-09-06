package com.trishul.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trishul.quizapp.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
	List<Question> findBycategory(String category);	
	}
