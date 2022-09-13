package com.arrays;

public class SetMatrixZero {
	
	private static void print(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			
			System.out.println();
		}
		
	}

	
	private static void setMatrixZero() {
		
		int[][] arr = {	{0, 1, 2, 0},
					 	{3, 4, 5, 2},
					 	{1, 3, 1, 5}
					 };
		int m = arr.length;
		int n = arr[0].length;
		int[] row = new int[m];
		int[] col = new int[n];
		
		
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(arr[i][j]==0) {
					row[i] = -1;
					col[j] = -1;
				}
			}
		}
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				if(row[i]==-1 || col[j]==-1)
					arr[i][j] = 0;
			}
		}
		
		print(arr);
		
	}

	public static void main(String[] args) {
		
		setMatrixZero();
		
		
		//--------------------------optimized-------------
		System.out.println("===========Optimized Approach=================");
		
		int[][] arr = {	{1, 1, 1, 1},
					 	{1, 0, 1, 1},
					 	{1, 1, 0, 1},
					 	{0, 0, 0, 1}
					 };
		
		int m = arr.length;
		int n = arr[0].length;
		
		int col0 = 1;
		for(int i=0;i<m;i++) {
			
			if(arr[i][0]==0)
				col0 = 0;
			
			for(int j=1;j<n;j++) {
				
				if(arr[i][j]==0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
					
			}
		}
		
		
		for(int i=m-1;i>=0;i--) {
			
			for(int j=n-1;j>=0;j--) {
				
				if(arr[i][0]==0 || arr[0][j]==0)
					arr[i][j] = 0;
			}
			
			if(col0==0)
				arr[i][0] = 0;
		}
		
		print(arr);

	}

}
