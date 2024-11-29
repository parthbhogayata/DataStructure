class reversearray{
	public static void main(String[] args){
		int[] arr = {1,4,3,2,6,5};
		int n = arr.length;
		int mid = n/2;
		int count = 0;
			for(int j = n-1 ; j >= mid ; j--){
				int temp = arr[count];
				arr[count] = arr[j];
				arr[j] = temp;
				count++;
			}
		for(int i = 0 ; i < n; i++){
			System.out.print(arr[i]);
		}
	}
}