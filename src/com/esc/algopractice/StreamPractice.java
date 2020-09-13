package com.esc.algopractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamPractice {
	
	static int formingMagicSquare(int[][] s) {
        int[][] magic_squares = {
                {8,1,6,3,5,7,4,9,2},
                {6,1,8,7,5,3,2,9,4},
                {4,9,2,3,5,7,8,1,6},
                {2,9,4,7,5,3,6,1,8},
                {8,3,4,1,5,9,6,7,2},
                {4,3,8,9,5,1,2,7,6},
                {6,7,2,1,5,9,8,3,4},
                {2,7,6,9,5,1,4,3,8}
                };
        
        List<Integer> arr = new ArrayList<>();
        for (int[] x: s) {
            for (int j: x) {
                arr.add(j);
            }
        }
        
        List<Integer> f = new ArrayList<>();
        for (int i=0;i<magic_squares.length;i++) {
        	int sum = 0;
            for (int j=0;j<magic_squares[i].length;j++) {
                int a = Math.abs(magic_squares[i][j] - arr.get(j));
                sum += a;
            }
            f.add(sum);
        }
        
        return Collections.min(f);


		
		


    }

	public static void main(String[] args) {
		
		Integer[][] arr = {{3},{11,2,4},{4,5,6},{10,8,-12}};
		int a = 0;
		int b = 0;
		for (int i=1;i<arr.length;i++) {
			a += arr[i][i-1];
			b += arr[i][arr[i].length-i];	
		}
		System.out.println(Math.abs(a-b));
		int[][] foo = {{4,8,2},{4,5,7},{6,1,6}};
		System.out.println(formingMagicSquare(foo));
		
		 
				
	
	
	}
}
