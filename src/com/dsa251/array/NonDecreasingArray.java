package com.dsa251.array;

public class NonDecreasingArray {
	
//	link :- https://www.naukri.com/code360/problems/non-decreasing-array_699920?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM

	public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		int req = 0;
		for(int i = 0; i < n-1; i++){
			
			if(arr[i] > arr[i+1]){
				req++;
				//to keep before i subarray in non decreasing
				if(i > 0 && arr[i+1] < arr[i-1]){
					arr[i+1] = arr[i];
				}else{  //to keep after i subarray in non decreasing
					arr[i] = arr[i+1];
				}
			}

			if(req > 1) return false;
		}
		return true;
	}
}
