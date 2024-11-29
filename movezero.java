import java.util.*;

class movezero{
	
//method - 1
	public static int[] method1(int[] arr , int n){
		int temp[] = new int[n];
		int j = 0;
		
		for(int i = 0; i<n; i++){
			if(arr[i] != 0){
				temp[j++] = arr[i]; 
			}
		}
		
		while(j<n){
			temp[j++] = 0;
		}
		return temp;
	}

//method - 2
	public static int[] method2(int[] arr , int n){
		int count = 0;
		for(int i = 0 ; i < n ; i++){
			if(arr[i] != 0){
				arr[count++] = arr[i];
			}
		}
		while(count<n){
			arr[count++] = 0;
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,0,4,3,0,5,0};
		int n = arr.length;
		
		//method - 1
		//int[] temp = method1(arr,n);   
		
		//method - 2
		int[] temp = method2(arr,n);
		
		for(int i = 0 ; i < n ; i++){
			System.out.print(temp[i]+" ");
		}
	}
}