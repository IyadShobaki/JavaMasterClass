
public class DiagnolStar {

	public static void main(String[] args) {
		
		//printSquareStar(10, 5,5);
		printSquareStar(10);
	}
	
	public static void printSquareStar(int number) {
		if(number < 5)
			System.out.println("Invalid Value");
		else {
			int num = number-1;
			for(int i = 0; i < number; i++) {
				if(i==0 || i == number-1) {
					for(int x=0; x < number; x++) {
						System.out.print("*");
					}
				}else {
					for(int x = 0; x < number; x++) {
						if(x== 0 || x==number-1 || x == i || x == num)
							System.out.print("*");
						else {
							System.out.print(" ");
						}
					}
				}
				num--;
				System.out.println();
			}
			
		}
	}

//	public static void printSquareStar(int number, int xX, int yY) {
//	
//		for(int i =0; i < number; i++) {
//			if(i == number-1) {
//				for(int x =0; x < number; x++) {
//					System.out.print("*");
//				}
//			}else {
//				for(int x= 0; x < number; x++) {
//					if(x == 0)
//						System.out.print("*");
//				}
//			}
//			if(i == yY) {
//				for(int x = 0; x < number; x++) {
//					if(x == xX) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//
//			System.out.println();
//		}
//	}
//	public static void printSquareStar(int number) {
//		if(number < 5)
//			System.out.println("Invalid Value");
//		else {
//			int num = number-1;
//			for(int i = 0; i < number; i++) {
//				if(i == 0 || i == (number -1) ) {
//					for(int x = 0; x < number; x++) {
//						System.out.print("*");
//					}
//				}else {
//					for(int x =0; x < number; x++) {
//						if(x == 0 || x == number-1 || x == i || x== num) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//				}
//				num--;
//				System.out.println();
//			}
//		}
//	}
	
//	public static void printSquareStar(int number) {
//		if(number < 5)
//			System.out.println("Invalid Value");
//		else {
//			for(int i =1; i <= number; i++) {
//				System.out.println("------------------------------------------------------------------------------------");
//				for(int x = 1; x <= number; x++) {
//					System.out.print(  i*x + "\t|");
//		
//				}
//				System.out.println();
//			}
//		}
//	}
	
	
	
	
	

	
	
	
	
//	public static void printSquareStar(int number) {
//		if(number < 5)
//			System.out.println("Invalid Value");
//		else {
//			int num = number -1;
//			for(int i= 0; i < number; i++) {
//				
//				if(i ==0 || i ==(number-1)) {
//					for(int x =0; x < number; x++) {
//						System.out.print("*");
//					}
//				}else {
//					for(int x = 0; x < number; x++) {
//						if(x ==0 || x == number-1 || x == i || x ==num)
//							System.out.print("*");
//						else {
//							System.out.print(" ");
//						}
//					}
//				}
//				num--;
//				System.out.println();
//			}
//		}
//	}
//	public static void printSquareStar(int number) {
//		if(number < 5)
//			System.out.println("Invalid Value");
//		else {
//			int num = number - 1;
//			for(int i =0; i <number; i++) {
//				if(i == 0 || i == (number-1)) {
//					for(int x=0; x < number; x++) {
//						System.out.print("*");
//					}
//				}else {
//					for(int x = 0; x < number; x++) {
//						if(x== 0 || x == number-1 || x==i || x ==num)
//							System.out.print("*");
//						else {
//							System.out.print(" ");
//						}
//					}
//				}
//				num--;
//				System.out.println();
//			}
//		}
//	}
	
	
//	public static void printSquareStar(int number) {
//		if(number < 5)
//			System.out.println("Invalid Value");
//		else {
//			int num= number-1;
//			for(int i =0; i < number; i++) {
//				if(i==0 || i == (number-1)) {
//					for(int x=0; x < number; x++) {
//						System.out.print("*");
//					}
//				}else {
//					for(int x=0; x < number; x++) {
//						if(x==0 || x==number-1 ||x==i || x ==num)
//							System.out.print("*");
//						else {
//							System.out.print(" ");
//						}
//						
//					}
//				
//				}
//				num--;
//				System.out.println();
//			}
//		}
//	
//	}
	
}
