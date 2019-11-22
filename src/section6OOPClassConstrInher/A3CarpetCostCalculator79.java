package section6OOPClassConstrInher;

public class A3CarpetCostCalculator79 {
	private double width;
	private double length;
	public A3CarpetCostCalculator79(double width, double length) {
		if(width < 0)
			this.width = 0;
		if(length < 0)
			this.length = 0;
		
		this.width = width;
		this.length = length;
	}
	public double getArea() {
		return width * length;
	}
}
