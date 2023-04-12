package com.UST.interview.repository;

import com.UST.interview.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepo extends JpaRepository<Interview,Integer> {
}
