package com.example.fizz_buzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.fizz_buzz.FizzBuzzApplication.fizzBuzz;
import static com.example.fizz_buzz.FizzBuzzApplication.fizzBuzz2;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFizzBuzz(){
		assertEquals("1", fizzBuzz(1)) ;
		assertEquals("Fizz", fizzBuzz(3));
		assertEquals("Buzz", fizzBuzz(5));
		assertEquals("FizzBuzz", fizzBuzz(15));
	}

	@Test
	void testFizzBuzz2(){
		assertEquals("1", fizzBuzz2(1));
		assertEquals("Fizz", fizzBuzz2(3));
		assertEquals("Fizz", fizzBuzz2(38));
		assertEquals("Buzz", fizzBuzz2(5));
		assertEquals("Buzz", fizzBuzz2(58));
		assertEquals("Buzz", fizzBuzz2(15));


	}


}
