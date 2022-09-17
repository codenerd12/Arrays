package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
	
	private static int longestSubstring(String str) {
		
		if(str.length()==0)
			return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		int lastInd = 0;
		int maxLen = Integer.MIN_VALUE;
		
		for(int i=0;i<str.length();i++) {
			
			
			if(map.containsKey(str.charAt(i))) {
				
				lastInd = Math.max(lastInd, map.get(str.charAt(i))+1);
			}
			
			map.put(str.charAt(i), i);
			maxLen = Math.max(maxLen, (i-lastInd)+1);
			
		}
		
		
		return maxLen;
	}

	public static void main(String[] args) {
		
		String str = "abcaabcdba";
		
		int len = longestSubstring(str);
		System.out.println(len);

	}

}
