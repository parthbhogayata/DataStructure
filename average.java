//Average Number in Array

class average{
	public static void main(String[] args){
		int sum = 0;
		int[] arr = {10,20,3,40,50,6,50};
		for(int i = 0 ; i < arr.length;i++){
			sum += arr[i]	;
		}
		System.out.print("Average is : "+sum/arr.length);
	}
}