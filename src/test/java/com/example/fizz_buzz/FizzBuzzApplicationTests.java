package com.example.fizz_buzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.fizz_buzz.FizzBuzzApplication.fizzBuzz;
import static com.example.fizz_buzz.FizzBuzzApplication.fizzBuzz2;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {

	/*
	* Tests for the method fizzBuzz()
	* Testing the return value of a given integer param 'number'*/

	@Test
	void shouldReturn1(){
		//Given
		int number = 1;

		//When
		String result = fizzBuzz(number);

		//Then
		String expected ="1";
		assertEquals(expected,result);
	}

	@Test
	void shouldReturnFizz(){
		//Given
		int number = 3;

		//When
		String result = fizzBuzz(number);

		//Then
		String expected ="Fizz";
		assertEquals(expected,result);
	}
	@Test
	void shouldReturnBuzz(){
		//Given
		int number = 5;

		//When
		String result = fizzBuzz(number);

		//Then
		String expected ="Buzz";
		assertEquals(expected,result);
	}

	@Test
	void shouldReturnFizzBuzz(){
		//Given
		int number = 30;

		//When
		String result = fizzBuzz(number);

		//Then
		String expected ="FizzBuzz";
		assertEquals(expected,result);
	}

	/*
	 * Tests for the method fizzBuzz2()
	 * Testing the return value of a given integer param 'number'*/

	@Test
	void shouldReturn1Stage2(){
		//Given
		int number = 1;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="1";
		assertEquals(expected,result);
	}

	@Test
	void shouldReturnFizzStage2(){
		//Given
		int number = 3;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="Fizz";
		assertEquals(expected,result);
	}
	@Test
	void shouldReturnFizzStage2Bis(){
		//Given
		int number = 37;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="Fizz";
		assertEquals(expected,result);
	}
	@Test
	void shouldReturnBuzzStage2(){
		//Given
		int number = 5;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="Buzz";
		assertEquals(expected,result);
	}
	@Test
	void shouldReturnBuzzStage2Bis(){
		//Given
		int number = 58;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="Buzz";
		assertEquals(expected,result);
	}

	@Test
	void shouldReturnFizzBuzzStage2(){
		//Given
		int number = 15;

		//When
		String result = fizzBuzz2(number);

		//Then
		String expected ="FizzBuzz";
		assertEquals(expected,result);
	}
}
