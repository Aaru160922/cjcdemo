package com.cjc.calculator;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public void addition() {
		int a = 10+1;
		System.out.println(a);
	}
	
	public void subtraction() {
		int b = 10-1;
		System.out.println(b);
	}
		
	public void multiplication(){
		int c = 2*2;
		System.out.println(c);
	}
}
