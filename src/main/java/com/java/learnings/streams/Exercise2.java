package com.java.learnings.streams;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This Exercise is to understand how to utilize peek method in java a stream in java.
 * 
 */
public class Exercise2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		list.stream().filter(number -> number % 2 == 0).peek(System.out::println)
		.map(n -> n * 20)
				.peek(System.out::println)
				.collect(Collectors.toList());
	}
}
