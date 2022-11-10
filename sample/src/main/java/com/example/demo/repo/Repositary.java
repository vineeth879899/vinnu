package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Data;

public interface Repositary extends JpaRepository<Data, Integer> {

}
