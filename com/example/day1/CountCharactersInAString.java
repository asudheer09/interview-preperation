package com.example.day1;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInAString {
	public static void main(String[] args) {
		String s = "hello";
		// h-1, e-1,l-2,o-1
		char[] chars = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : chars) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
