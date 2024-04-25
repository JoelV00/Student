package com.studentres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentres.entity.Results;
import com.studentres.pojo.ResultPojoStudent;
import com.studentres.service.ResultService;



@RestController
@RequestMapping(value="/results")
public class ResultControllers {
	@Autowired
	RestTemplate rt;

	@Autowired
	ResultService rs;
	
  @PostMapping(value="/postAll")
  public String postAll(){
	String url1="http://localhost:8080/student/getAll";
	String url2="http://localhost:8081/mark/getMark/";
	
	List<Results> r=new ArrayList<Results>();
	ResponseEntity<List<ResultPojoStudent>> response1=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<ResultPojoStudent>>(){	});
	List<ResultPojoStudent> products=response1.getBody();
	products.forEach(x->{
		Results r1=new Results();
		int a=x.getId();
		ResponseEntity<Integer> respose2=rt.exchange(url2+a, HttpMethod.GET, null, Integer.class);
		r1.setId(x.getId());
		r1.setName(x.getName());
		r1.setRollNumber(x.getRollNumber());
		int temp=respose2.getBody();
		if(x.getAttendance()>=90) {
			temp=temp+20;
		}
		
		
		r1.setTotal(temp);
		r1.setPercentage(temp/4);
		
		r.add(r1);
		
	});
	return rs.postAll(r);
  }
  

  	
  	@PostMapping(value="/post")
  	public String post(@RequestBody Results a){
  		return rs.post(a);
  	}
  	@GetMapping(value="/getAll")
  	public List<Results> getAll() {
  		return rs.getAll();
  	}
  	@PatchMapping(value="/update/{a}")
  	public String Update(@RequestBody Results s,@PathVariable int a) {
  		return rs.Update(s,a);
  	}
  	@DeleteMapping(value="/deleteId/{a}")
  	public String delId(@PathVariable int a) {
  		return rs.delId(a);
  	}
  	@GetMapping(value="/getTopper")
  	public List<Results> topper() {
  		
  		return rs.topper();
  	}
  	
  	@GetMapping(value="/getTopThree")
  	public List<Results> topThree() {
  		
  		return rs.topThree();
  	}
  	@GetMapping(value="/getBetween/{a}/{b}")
  	public List<Results> getBetween(@PathVariable int  a,@PathVariable int b) {
  		
  		return rs.getBetween(a,b);
  	}

  }

  
  

