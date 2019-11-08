package com.stackroute;

import java.util.Scanner;

public class LargestDifference {

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
   	//Use Scanner to get input from console
    	
    	int count;
    	int[] numInt;
    	Scanner s= new Scanner(System.in);
    	count = s.nextInt();
    	numInt = new int[count];
    	for(int i=0;i<count;i++) {
    		
    		numInt[i] = s.nextInt();
    	}
    	
    	int index = findLargestDifference(numInt);
    	System.out.println(index);

	}

	public static int findLargestDifference(int[] numbers) {
		int index = -1;
		int mDiff = 0;
		if(null != numbers && numbers.length > 1) {
			int s = numbers.length;
			for(int i = 0;i < s; i++) {
				int d = 0;
				int j = i+1;
				if(j < s) {
					d = numbers[j] - numbers[i];
					if(d  > 0 && d > mDiff) {
						index = j;
						mDiff = d;
					}else {
						
						d = numbers[i] - numbers[j];
						if(d>mDiff) {
							mDiff = d;
							index = i;
						}
						
					}
				}
			}
		}
		return index;
	}

}
