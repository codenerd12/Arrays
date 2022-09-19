package com.arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
	
	private static void nextGreaterElement(int[] nums, int n) {
		
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=2*n-1;i>=0;i--) {
           
           while(!stack.isEmpty() && stack.peek() <= nums[i%n])
               stack.pop();
           
            if(i<n) {
               if(stack.isEmpty())
                   res[i%n] = -1;
               else
                   res[i%n] = stack.peek();
           
            }
            
            
           stack.push(nums[i%n]);
           
           
       }
        
      System.out.println(Arrays.toString(res));
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 1, 2};
		int n = arr.length;
		
		nextGreaterElement(arr, n);

	}

}
