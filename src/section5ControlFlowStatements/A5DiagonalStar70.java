package section5ControlFlowStatements;

public class A5DiagonalStar70 {

	public static void main(String[] args) {
		printSquareStar(20);
	
	}
	public static void printSquareStar(int number) {
		if(number < 5)
			System.out.println("Invalid Value");
		else {
			int num= number-1;
			for(int i =0; i < number; i++) {
				if(i==0 || i == (number-1)) {
					for(int x=0; x < number; x++) {
						System.out.print("*");
					}
				}else {
					for(int x=0; x < number; x++) {
						if(x==0 || x==number-1 ||x==i || x ==num)
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
}
