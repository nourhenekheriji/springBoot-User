package com.example.demo.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.user.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}
