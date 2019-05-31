package com.in28minutes.springboot.rest.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DemoController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String getAllPets() {
		System.out.println("inside");
	    return "hello world";
	  }

}
