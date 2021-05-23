
public class BinarySearch {

	public static int search(int target, int[] ar, int startIndex, int endIndex) {
		// Finds target in ar from startIndex to endIndex
		// Returns its index when found, else returns -1
		
		if(startIndex > endIndex) {
			// target not found
			return -1;
		}

		int midIndex = (startIndex + endIndex) / 2;
		//System.out.println("mid: " + midIndex);
		//System.out.println("ar[mid]: " + ar[midIndex]);
		
		if(ar[midIndex] == target) {
			return midIndex;
		} else if(ar[midIndex] < target) {
			return search(target, ar, midIndex+1, endIndex);
		} else {
			return search(target, ar, startIndex, midIndex-1);			
		}
	}
	
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,60,70,80,90};
		//int [] ar = {60, 70};
		int target = 50;
		
		int startIndex = 0;
		int endIndex = ar.length-1;

		System.out.println(search(target, ar, startIndex, endIndex));		
	}

}
