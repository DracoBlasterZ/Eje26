package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.*;

public interface CientificosDAO extends JpaRepository<Cientificos, String>
{
	
}