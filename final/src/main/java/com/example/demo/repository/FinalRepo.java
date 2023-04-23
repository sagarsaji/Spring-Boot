package com.example.demo.repository;

import com.example.demo.entity.Final;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinalRepo extends JpaRepository<Final,String> {
    List<Final> findByState(String state);
}
