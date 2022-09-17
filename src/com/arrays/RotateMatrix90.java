package com.arrays;

public class RotateMatrix90 {
	
	private static void print(int[][] arr, int m, int n) {
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) 
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	private static void rotateMatrix(int[][] arr, int m, int n) {
		
		for(int i=0;i<m;i++) {
			
			for(int j=i;j<n;j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//print(arr, m, n);
		//clockwise
		for(int i=0;i<m;i++) 
			for(int j=0;j<n/2;j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		
		
		//anticlockwise
		/*for(int i=0;i<m/2;i++)
			for(int j=0;j<n;j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[m-1-i][j];
				arr[m-1-i][j] = temp;
				
			}*/
			
		print(arr, m, n);
		
	}


	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					};
		
		int m = arr.length;
		int n = arr[0].length;
		
		rotateMatrix(arr, m, n);

	}

}
