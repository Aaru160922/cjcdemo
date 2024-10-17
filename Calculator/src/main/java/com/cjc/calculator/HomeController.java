package com.cjc.calculator;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public void addition() {
		int a = 10+1;
		System.out.println(a);
	}
		
	
}
