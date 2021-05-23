
public class Pattern {

	public static void main(String[] args) {
		String str = "GDCDGCCGDKDGCCGCCGDKSDJGCCGDFF";
		String pat = "GCCG";
		
		int strSize = str.length(); // Size of the string
		int startIndex = 0; // Index of the string where it starts to match the pattern
		int patSize = pat.length(); // Size of the pattern
		int patIndex = 0; // Index of the pattern 
		
		for(int i=0; i<strSize; i++) {
			if(str.charAt(i) == pat.charAt(patIndex)) { 
				if(patIndex == 0) {
					// Set startIndex
					startIndex = i;
				}
				patIndex++; 
			}
			else { 
				patIndex = 0;
			}
			// Pattern match
			if(patIndex == patSize) {
				System.out.println(startIndex);
				patIndex = 0;
			}
		}
	}
}
