package com.example.fizz_buzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {
	public static String fizzBuzz(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz"; //if the number is divisible by 5 and 3 (by 15) FizzBuzz is returned
		} else if (number % 3 == 0) {
			return "Fizz"; //if the number is divisible by 3 Fizz is returned
		} else if (number % 5 == 0) {
			return "Buzz"; //if the number is divisible by 5 Buzz is returned
		} else {
			return Integer.toString(number); //if the number is not divisible by 15 or 5 or by 3 his value is returned
		}
	}

	public static String fizzBuzz2(int number) {

		if (number % 15 == 0) {
			return "FizzBuzz"; //if the number is divisible by 5 and 3 (by 15) FizzBuzz is returned
		} else if (number % 3 == 0 || Integer.toString(number).contains("3")) {
			return "Fizz"; //if the number is divisible by 3 or contains 3 Fizz is returned
		} else if (number % 5 == 0 || Integer.toString(number).contains("5")) {
			return "Buzz"; //if the number is divisible by 5 or contains 5 Fizz is returned
		} else {
			return Integer.toString(number); //if the number is not divisible by 15 or 5 or by 3 his value is returned
		}
	}

	public static void main(String[] args){
		SpringApplication.run(FizzBuzzApplication.class, args);


	}
}
