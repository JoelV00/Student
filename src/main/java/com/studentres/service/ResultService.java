package com.studentres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentres.dao.ResultDao;
import com.studentres.entity.Results;

@Service
public class ResultService {
	@Autowired
	ResultDao rd;

	public String postAll(List<Results> a) {

		return rd.postAll(a);
	}

	public List<Results> getAll() {
		return rd.getAll();
	}

	public String post(Results a) {

		return rd.post(a);
	}

	public String Update(Results s, int a) {
		return rd.Update(s, a);
	}

	public String delId(int a) {
		return rd.delId(a);
	}

	public List<Results> topper() {

		return rd.topper();
	}

	public List<Results> topThree() {

		return rd.topThree();
	}

	public List<Results> getBetween(int a, int b) {

		return rd.getBetween(a, b);
	}

}