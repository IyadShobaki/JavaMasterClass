package section7OOPCompositionEncapsPoly;

public class A2Bedroom91 {
	private String name;
	private A2Wall91 wall1;
	private A2Wall91 wall2;
	private A2Wall91 wall3;
	private A2Wall91 wall4;
	private A2Ceiling91 ceiling;
	private A2Bed91 bed;
	private A2Lamp91 lamp;
	public A2Bedroom91(String name, A2Wall91 wall1, A2Wall91 wall2, A2Wall91 wall3, A2Wall91 wall4, A2Ceiling91 ceiling, A2Bed91 bed,
			A2Lamp91 lamp) {
		super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	
	public A2Lamp91 getLamp() {
		return this.lamp;
	}
	
	public void makeBed() {
		System.out.println("Bedroom -> Making bed");
		bed.make();
		
	}
}
