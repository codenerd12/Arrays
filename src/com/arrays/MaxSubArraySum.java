package com.arrays;

public class MaxSubArraySum {

	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
       long max = 0;
       long temp = 0; 
       int startInd = 0;
       int lastInd = -1;
       
       for(int i=0;i<n;i++) {
           
           temp += arr[i];
           
           if(temp>max) {
               max = temp;
               lastInd = i;
           }
           
           if(temp<0) {
               temp=0;
               startInd = i+1;
           }
               
           
       }
        
        System.out.println("StartIndex: "+startInd+" EndIndex: "+lastInd);
        
        return max;
        
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,7,-4,3,2,-10,9,1};
		int n = arr.length;
		
		System.out.println("MaxSum: "+maxSubarraySum(arr, n));
		
		

	}

}
