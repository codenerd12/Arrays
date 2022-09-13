package com.arrays;

public class SortArr01And2 {
	
	public static void swap(int[] arr, int i, int j) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    public static void sort012(int[] arr)
    {
        //Write your code here
        int lw = 0;
        int up = arr.length-1;
        int mid = 0;
        
        while(mid<=up) {
            
            switch(arr[mid]) {
                    
                case 0:
                swap(arr, lw, mid);
                lw++;
                mid++;
                break;
                    
                case 1:
                mid++;
                break;
                    
                case 2:
                swap(arr, mid, up);
                up--;
                break;
                    
            }
            
        }
    }

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 2, 2, 1, 0};
		
		sort012(arr);
	}

}
