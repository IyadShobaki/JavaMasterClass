package section6OOPClassConstrInher;

public class A7PoolAreaTester88 {

	public static void main(String[] args) {
		A7RectangleClass88 rectangle = new A7RectangleClass88(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		A7CuboidInheritRectangle88 cuboid = new A7CuboidInheritRectangle88(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}

}
