
class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int size = arr.length;
		int temp;
		
		for(int i=size;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}
}
