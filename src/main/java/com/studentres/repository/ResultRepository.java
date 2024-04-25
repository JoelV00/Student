package com.studentres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentres.entity.Results;

public interface ResultRepository extends JpaRepository<Results, Integer> {

	@Query(value = "SELECT * FROM results ORDER BY  total desc LIMIT 1;", nativeQuery = true)
	public List<Results> topper();

	@Query(value = "SELECT * FROM results ORDER BY  total desc LIMIT 3;", nativeQuery = true)
	public List<Results> topThree();

	@Query(value = "SELECT * FROM results WHERE percentage BETWEEN ? AND ?", nativeQuery = true)
	public List<Results> getBetween(int a, int b);

}
