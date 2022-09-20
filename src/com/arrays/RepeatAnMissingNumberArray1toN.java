package com.arrays;

public class RepeatAnMissingNumberArray1toN {
	
	public static void usingCountSort(int[] arr) {
		int n = arr.length;
		int[] count = new int[n+1];
		int res[] = new int[2];
		
		for(int i=0;i<n;i++)
			count[arr[i]]++;
		
		
		for(int i=0;i<=n;i++) {
			
			if(count[i]==0)
				res[0] = i;
			
			if(count[i]>1)
				res[1] = i;
				
		}
		
		System.out.println("Missing No:"+res[0]+" Duplicate: "+res[1]);
		
		
	}
	
	public static void duplicateAndMissingNumber(int[] arr) {
		
		int n = arr.length;
		int res[] = new int[2];
		
		for(int i=0;i<n;i++) {
			
			int ind = Math.abs(arr[i]);
			
			//duplicate number
			if(arr[ind-1]<0)
				res[1] = arr[i];
			
			arr[ind-1] = -Math.abs(arr[ind-1]);
				
			
		}
		
		for(int i=0;i<n;i++)
			if(arr[i]>0)
				res[0] = i+1;
		
		
		System.out.println("Missing No:"+res[0]+" Duplicate: "+res[1]);
	}
	
	

	public static void main(String[] args) {
		
		
		int[] arr = {3,1,2,5,4,6,7,5};
		
		usingCountSort(arr);
		
		duplicateAndMissingNumber(arr);
		
		
		

	}

}
