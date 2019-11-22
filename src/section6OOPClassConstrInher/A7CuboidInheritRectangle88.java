package section6OOPClassConstrInher;

public class A7CuboidInheritRectangle88 extends A7RectangleClass88{
	private double height;

	public A7CuboidInheritRectangle88(double width, double length, double height) {
		super(width, length);
		if(height < 0) {
			this.height =0;
		}else {
			this.height = height;
		}
		
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return height * getArea();
	}
	
}
