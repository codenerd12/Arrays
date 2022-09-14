package com.arrays;

public class StockBuyAndSell {
	
	public static int maximumProfit(int[] prices){

		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++) {
            
            min = Math.min(min, prices[i]);
            
            max = Math.max(max, prices[i]-min);
            
        }
        
        return max;
    }

	public static void main(String[] args) {
		
		int arr[] = {98, 101, 66, 72};
		
		System.out.println("Max Profit: "+maximumProfit(arr));

	}

}
