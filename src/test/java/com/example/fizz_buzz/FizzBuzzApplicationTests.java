package com.example.fizz_buzz;

import org.junit.jupiter.api.Test;
import com.example.fizz_buzz.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serial;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFizzBuzz(){
		assertEquals("1", new FizzBuzzApplication().FizzBuzz(1)) ;
		assertEquals("Fizz", new FizzBuzzApplication().FizzBuzz(3));
		assertEquals("Buzz", new FizzBuzzApplication().FizzBuzz(5));
		assertEquals("FizzBuzz", new FizzBuzzApplication().FizzBuzz(15));
	}


}
