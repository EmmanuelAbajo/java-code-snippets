package com.esc.algopractice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinusSolution {
	
	static void plusMinus(int[] arr) 
	{	
		// We could use Arrays.stream(arr) in place of IntStream.of(arr
		List<Integer> foo = IntStream.of(arr).boxed().collect(Collectors.toList());

        int positive = foo.stream().filter(x -> Math.abs(x) == x && x != 0)
                                .collect(Collectors.toList()).size();
        int negative = foo.stream().filter(x -> Math.abs(x) != x)
                .collect(Collectors.toList()).size();
        int zero = foo.stream().filter(x -> x == 0)
                .collect(Collectors.toList()).size();
        
        printer(positive,negative,zero,foo.size());      
        
    }
	
	static void plusMinusAlt(int[] arr) 
	{
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        for (int x: arr) {
            if (Math.abs(x)==x && x!=0) {
                positive++;
            }
            else if(Math.abs(x)!=x ) {
                negative++;
            }
            else {
                zero++;
            }
        }
        
        printer(positive,negative,zero,arr.length);
        
    }
	
	static void printer(int positive,int negative,int zero,int len) 
	{
		BigDecimal num1 = new BigDecimal(positive);
        BigDecimal num2 = new BigDecimal(negative);
        BigDecimal num3 = new BigDecimal(zero);
        BigDecimal num4 = new BigDecimal(len);
        
        System.out.println(num1.divide(num4, 6, RoundingMode.HALF_UP).toString());
        System.out.println(num2.divide(num4, 6, RoundingMode.HALF_UP).toString());
        System.out.println(num3.divide(num4, 6, RoundingMode.HALF_UP).toString());
	}
	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		List<Integer> scoresList = IntStream.of(scores).boxed().collect(Collectors.toList());
		List<Integer> aliceList = IntStream.of(alice).boxed().collect(Collectors.toList());
		
		TreeSet<Integer> foo = new TreeSet<>(scoresList);
		
		int[] result = aliceList.stream().map((x)-> {
			return returnIndex(foo,x);
		}).mapToInt(Integer::intValue).toArray();
	
		System.out.println(Arrays.toString(result));
		return result;

    }
	
	static Integer returnIndex(TreeSet<Integer> foo,Integer x) {
		foo.add(x);
		SortedSet<Integer> f =  foo.descendingSet();
		return 1 + f.stream().collect(Collectors.toList()).indexOf(x);
		
	}

	
	
	public static void main(String[] args) {
		int[] foo = {-4,3,-9,0,4,1};
		int[] scores = {100,100,50,40,40,20,10};
		int[] alice = {5,25,50,120};
		plusMinus(foo);
		plusMinusAlt(foo);
		climbingLeaderboard(scores,alice);
		
	}

}
 