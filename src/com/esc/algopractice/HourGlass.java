package com.esc.algopractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourGlass {

	int hourglassSum(List<List<Integer>> arr) {
		List<Integer> values = new ArrayList<>();

		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.size() - 2; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

				values.add(sum);
			}

		}

		return Collections.max(values);
	}

}
