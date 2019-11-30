

public class DiamondShape {

	public static void main(String[] args) {

	printDiamond(20);

	}
	public static void printDiamond(int number) {
		int num1 = number /2;
		int num2 = number-1;
		int num3 = 1;
		for(int i = 0; i < number/2; i++) {
			if(i == number/2) {
				for(int x =0; x < number; x++) {
					if(x == 0 || x == number-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}	
			}else if(i == 0 ) {
					for(int x= 0; x< number; x++) {
						if(x==number/2) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
			}else {
				for(int x = 0; x< number/2; x++) {
					if(x == num1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				for(int x =0; x < number/2; x++) {
					if(x ==i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
		
			}
			num1--;
			System.out.println();
		}
		for(int i = number/2; i < number; i++) {
			if(i == number-1) {
				for(int x =0; x < number; x++) {
					if(x == number/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}	
			}else {
				for(int x =0; x < number/2; x++) {
					if(x ==num3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				for(int x = number/2; x< number; x++) {
					if(x == num2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
		
			}
			num3++;
			num2--;
			num1--;
			System.out.println();
		}
	}

}
