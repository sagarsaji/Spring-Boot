/**
 * 
 */
package com.example.JpaManytoMany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Students;

/**
 * @author Administrator
 *
 */
public interface Studentrepo extends JpaRepository<Students,Long>{

	List<Students> findByNameContaining(String name);


		

	

}
