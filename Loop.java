

class Loop {

	public static void main(String[] args) {
		int num = 1;
		int space = 4;
		for(int i=0; i<4; i++) {
			// Spaces on the right side
			for(int j=0; j<space-i; j++) {
				System.out.print(" ");
			}
			// Number on the right
			System.out.print(num++);
			// Spaces in the middle and number on the left
			if (i>0){
				for(int j=0;j<i*2-1;j++) {
					System.out.print(" ");
				}
				System.out.print(num++);
			}
			// Spaces on the left side
			for(int j=0; j<space-i; j++) {
				System.out.print(" ");
			}
			// Line change
			System.out.print("\n");
		}
		System.out.print("890123456"); // Last line
	}

}
