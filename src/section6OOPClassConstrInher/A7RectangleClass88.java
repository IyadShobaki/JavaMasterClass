package section6OOPClassConstrInher;

public class A7RectangleClass88 {
	private double width;
	private double length;
	public A7RectangleClass88(double width, double length) {
		if(width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		if (length <0) {
			this.length = 0;
		}else {
			this.length = length;
		}
		
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return width * length;
	}
	
}
