package com.greatlearning.labSession.service;

public class BubbleSortImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;i++) {
			if(arr[j] < arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}	
		  }
		
		}

    }
}	
