import java.util.*;
class secondlarge{
	public static void main(String[] args){
		int[] arr = {10,10,10};
		int max = 0;
		int second_max = 0;
		if(arr.length > 2){
			for(int i = 0 ; i < arr.length ; i++){
				if(arr[i] > max){
					second_max = max;
					max = arr[i];
				}
				else if(arr[i] > second_max && arr[i] != max){
					second_max = arr[i];
				}
			}
			if(second_max == max){
				System.out.print("-1");
			}
			else{
				System.out.println("Second large value is : "+second_max);
			}
		}
		else{
			System.out.print("Please enter valid length of array");
		}
	}
}