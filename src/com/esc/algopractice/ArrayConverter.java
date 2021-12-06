package com.esc.algopractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayConverter {

	int[] toListArray(List<Integer> arr) {
		return arr.stream().mapToInt(i -> i).toArray();
	}

	String[] toStringArray(List<String> arr) {
		return arr.stream().toArray(String[]::new);
	}

	List<Integer> toIntegerList(int[] arr) {
		return IntStream.of(arr).boxed().collect(Collectors.toList());
	}

	List<String> toIntegerList(String[] arr) {
		return Arrays.asList(arr);
	}

	void printObject(Stream<?> stream) {
		stream.forEach(System.out::println);
	}

}
