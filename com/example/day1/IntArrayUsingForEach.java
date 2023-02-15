package com.example.day1;

import java.util.HashMap;
import java.util.Map;

public class IntArrayUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {1,2,3,14,69,78};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}

		// i=0   0<6  numbers[0]= 1
		// i=1	 1<6  numbers[1]= 2
		// i=2   2<6  numbers[2]= 3
		// i=3   3<6  numbers[3]= 14
		// i=4   4<6  numbers[4]= 69
		// i=5   5<6  numbers[5]= 78
		// i=6   6<6
		
		//using for each
		System.out.println("Print array using foreach");
		
		for(int n:numbers) {
			System.out.println(n);
		}
		
		String[] names= {"hi","hello","world","java","codes"};
		
		System.out.println("Print String array using foreach");

		for(String s:names) {
			System.out.println(s);
		}
		
		System.out.println("Print char array using foreach");

		
		String s="hello";
		char[] chars=s.toCharArray();
		
		for(char ch:chars) {
			System.out.println(ch);
		}
		
		
		Map<String,Integer> map= new HashMap<>();
		
		map.put("sudheer",1234);
		map.put("surendra", 456);
		map.put("kb", 786);
		map.put("kb", 787);
		
		System.out.println(map);
		
		System.out.println(map.get("kb"));
		
		System.out.println(map.containsKey("asss"));
		
		
		
	}

}
