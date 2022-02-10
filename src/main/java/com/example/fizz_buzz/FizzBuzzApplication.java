package com.example.fizz_buzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {
	public String FizzBuzz(int number){
		if(number % 15 == 0){
			return "FizzBuzz";
		}else if (number % 3 == 0){
			return "Fizz";
		}else if (number % 5 == 0){
			return "Buzz";
		}else{
			return  Integer.toString(number) ;
		}
	}
	public String FizzBuzz2(int number){

		if(number % 15 == 0){
			return "FizzBuzz";
		}else if (number % 3 == 0 || Integer.toString(number).contains("3")){
			return "Fizz";
		}else if (number % 5 == 0 ||  Integer.toString(number).contains("5")){
			return "Buzz";
		}else{
			return  Integer.toString(number) ;
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
