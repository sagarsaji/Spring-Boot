package com.example.Students.repository;

import com.example.Students.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstituteRepo extends JpaRepository<Institution,Integer> {
    Optional<Institution> findByInstitutename(String institutename);
}
