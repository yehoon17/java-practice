
class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int size = arr.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
