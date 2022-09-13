package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	private static List<List<Integer>> pascalTriangle(int numRows) {
		
		List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = null;
        
        
        for(int i=0;i<numRows;i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                
                if(j==0 || j==i)    
                    list.add(1);
                else {
                    
                    list.add(prev.get(j-1)+prev.get(j));
                }
                
                
            }
            
            prev = list;
            ans.add(prev);
        }
        
        return ans;
        
	}

	public static void main(String[] args) {
		
		int numRows = 5;
		
		List<List<Integer>> ans = pascalTriangle(numRows);
		System.out.println(ans);

	}

}
