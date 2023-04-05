/**
 * 
 */
package com.example.JpaManytoMany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Courses;

/**
 * @author Administrator
 *
 */
public interface Courserepo extends JpaRepository<Courses,Long>{

	

}
