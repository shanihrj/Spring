package com.mycontroller;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Model;

@RestController
public class Mycontroller {
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<Model> add(@RequestBody Result result){
		System.out.println("in contrller");
		System.out.println(result.getA()+"   "+result.getB());
		result.setResult(result.getA()+result.getB());

		//return result.toString();
		return new ResponseEntity<>(HttpStatus.OK);

	}
}
