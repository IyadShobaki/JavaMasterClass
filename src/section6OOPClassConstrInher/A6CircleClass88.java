package section6OOPClassConstrInher;

public class A6CircleClass88 {
	private double radius;

	public A6CircleClass88(double radius) {
		if(radius < 0)
			this.radius = 0;
		else {
			this.radius = radius;
		}
		
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
