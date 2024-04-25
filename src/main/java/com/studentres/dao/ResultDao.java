package com.studentres.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentres.entity.Results;
import com.studentres.repository.ResultRepository;

@Repository
public class ResultDao {
	@Autowired
	ResultRepository rr;

	public String postAll(List<Results> a) {
		rr.saveAll(a);
		return "All Entries are saved successfully";
	}

	public List<Results> getAll() {
		return rr.findAll();
	}

	public String post(Results a) {

		rr.save(a);
		return "Saved Successfully";
	}

	public String Update(Results s, int a) {
		s.setId(a);
		rr.save(s);
		return "Updated";
	}

	public String delId(int a) {
		rr.deleteById(a);
		return "Deteled Successfully";
	}

	public List<Results> topper() {
		return rr.topper();
	}

	public List<Results> topThree() {

		return rr.topThree();
	}

	public List<Results> getBetween(int a, int b) {

		return rr.getBetween(a, b);
	}
}
