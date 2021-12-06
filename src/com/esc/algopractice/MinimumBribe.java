package com.esc.algopractice;

import java.util.List;

public class MinimumBribe {

	void minimumBribes(List<Integer> q) {
		int ans = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if ((q.get(i) - (i + 1)) > 2) {
				System.out.println("Too chaotic");
				return;
			}
			int start = Math.max(0, q.get(i) - 2);
			for (int j = start; j < i; j++) {
				if (q.get(j) > q.get(i))
					ans++;
			}
		}
		System.out.println(ans);
	}

}
