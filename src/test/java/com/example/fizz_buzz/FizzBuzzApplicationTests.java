package com.example.fizz_buzz;

import org.junit.jupiter.api.Test;
import com.example.fizz_buzz.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serial;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {
	FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	@Test
	void contextLoads() {
	}

	@Test
	void testFizzBuzz(){
		assertEquals("1", fizzBuzz.FizzBuzz(1)) ;
		assertEquals("Fizz", fizzBuzz.FizzBuzz(3));
		assertEquals("Buzz", fizzBuzz.FizzBuzz(5));
		assertEquals("FizzBuzz", fizzBuzz.FizzBuzz(15));
	}

	@Test
	void testFizzBuzz2(){
		assertEquals("1", fizzBuzz.FizzBuzz2(1));
		assertEquals("Fizz", fizzBuzz.FizzBuzz2(3));
		assertEquals("Fizz", fizzBuzz.FizzBuzz2(38));
		assertEquals("Buzz", fizzBuzz.FizzBuzz2(5));
		assertEquals("Buzz", fizzBuzz.FizzBuzz2(58));
		assertEquals("Buzz", fizzBuzz.FizzBuzz2(15));


	}


}
