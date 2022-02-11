package com.example.fizz_buzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
	public static void createFile(){
		try {
			File file = new File("fizzBuzz.txt");
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
				System.out.println("Path created: " + file.getPath());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void insertValue(String result){
		result= result + "\n";
		try {
			Path path = Paths.get("./fizzBuzz.txt");
			Files.write(path, result.getBytes() , StandardOpenOption.APPEND);
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	public static void main(String[] args){
		SpringApplication.run(FizzBuzzApplication.class, args);
		createFile();
		String result;
		for (int i = 1; i <= 100; i++) {
			result = fizzBuzz(i);
			System.out.println(result);
			insertValue(result);

		}

	}
}
