package section6OOPClassConstrInher;

public class A6CircleCylinderTester {

	public static void main(String[] args) {
		A6CircleClass88 circle = new A6CircleClass88(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		A6CylinderInheritCircle88 cylinder = new A6CylinderInheritCircle88(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

	}

}
