//Count number of even and odd elements in an array

import java.util.*;

class countoddeven{
	public static void main(String[] args){
		int[] arr = {10,9,51,35,47,38,95,42,50};
		int n = arr.length;
		int odd = 0;
		int even = 0;
		for(int i = 0 ; i < n ; i++){
			if(arr[i] % 2 == 0){
				even++;
			}
			else if(arr[i] % 2 != 0){
				odd++;
			}
			else{
				System.out.println("Please enter valid Number...");
			}
		}
		System.out.println("Total Even Number is : "+even);
		System.out.println("Total Odd Number is  : "+odd);
	}
}

//Time Complexcity :  O(n)
//Space Complexcity : O(1)
