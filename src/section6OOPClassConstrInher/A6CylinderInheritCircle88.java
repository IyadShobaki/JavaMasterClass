package section6OOPClassConstrInher;

public class A6CylinderInheritCircle88 extends A6CircleClass88 {
	private double height;

	public A6CylinderInheritCircle88(double radius, double height) {
		super(radius);
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
