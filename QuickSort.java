import java.util.Arrays;

public class QuickSort {
	
	private static void sort(int[] ar, int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			// End of recursion
			return;
		}
		
		int midIndex = (startIndex + endIndex) / 2;
		int pivot;
		
		// Swap ar[midIndex] and ar[endIndex]
		pivot = ar[midIndex];
		ar[midIndex] = ar[endIndex];
		ar[endIndex] = pivot;
		
		// System.out.println("from " + startIndex + " to " + endIndex);
		// System.out.println("pivot: " + pivot);

		int forwardIndex = startIndex; // Index going forward from startIndex to find numbers on pivot's right side
		int backwardIndex = endIndex-1; // Index going backward from endIndex to find numbers on pivot's left side
		int temp; 
		boolean isPivoted = false;
		
		while(forwardIndex <= backwardIndex) {
			if(ar[forwardIndex]<pivot) { 
				forwardIndex++;
			} else { // Found number on pivot's right side from the left side
				while(ar[backwardIndex]>pivot) {
					if(forwardIndex == backwardIndex) {
						isPivoted = true;
						break;
					}
					backwardIndex--;
				}
				if (!isPivoted) {
					temp = ar[forwardIndex];
					ar[forwardIndex] = ar[backwardIndex];
					ar[backwardIndex] = temp;	
					forwardIndex++;
					backwardIndex--;
				} else {
					break;
				}
			}	
		}

		temp = ar[forwardIndex];
		ar[forwardIndex] = ar[endIndex];
		ar[endIndex] = temp;	
		
		// System.out.println(Arrays.toString(ar));
		// System.out.println();
		
		sort(ar,startIndex,forwardIndex-1);
		sort(ar,forwardIndex+1,endIndex);
	}
	
	
	public static void main(String[] args) {
		int [] ar = {50, 40, 80, 90, 10, 70, 30, 60, 20};
		//int [] ar = {1,2,3};
		int startIndex = 0;
		int endIndex = ar.length-1;	
		
		sort(ar, startIndex, endIndex);
		
		System.out.println(Arrays.toString(ar));	
	}
}
