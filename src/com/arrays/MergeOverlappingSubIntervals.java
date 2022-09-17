package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubIntervals {
	
	private static void mergeIntervals(int[][] intervals) {
		
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		
		int lastStart = intervals[0][0];
		int lastEnd = intervals[0][1];
				
		List<Integer> list = null;		
		for(int i=0;i<intervals.length;i++) {
			
			
			if(lastEnd >= intervals[i][0]) {
				
				if(lastEnd < intervals[i][1])
					lastEnd = intervals[i][1];
				
			} else {
				
				list = new ArrayList<Integer>();
				list.add(lastStart);
				list.add(lastEnd);
				ans.add(list);
				
				lastStart = intervals[i][0];
				lastEnd = intervals[i][1];
				
			}
			
		}
		
		list = new ArrayList<Integer>();
		list.add(lastStart);
		list.add(lastEnd);
		ans.add(list);
		
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
			
		int[][] intervals = {
								{1,3},
								{2,4},
								{2,6},
								{8,9},
								{8,10},
								{9,11},
								{15,18},
								{16,17}
							};
		
		mergeIntervals(intervals);
		
	}

}
