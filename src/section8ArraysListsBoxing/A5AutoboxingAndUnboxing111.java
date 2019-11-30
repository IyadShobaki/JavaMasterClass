package section8ArraysListsBoxing;

import java.util.ArrayList;

class IntClass{
	private int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
}
public class A5AutoboxingAndUnboxing111 {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Tim");
		
		//ArrayList<int> intArrayList = new ArrayList<>();     <------  wrong
		ArrayList<IntClass> intClassArrayList  = new ArrayList<IntClass>(); // work, but messy code better way is to use autoboxing
		intClassArrayList.add(new IntClass(54));
		
		ArrayList<Integer> intArrayList = new ArrayList<>();
		for(int i =0; i  <= 10; i++) {
			intArrayList.add(Integer.valueOf(i));  //called autoboxing --> Integer.valueOf(i)
		}
		for(int i =0; i  <= 10; i++) {
			System.out.println(i + " --> " + intArrayList.get(i).intValue()); // called unboxing --> intArrayList.get(i).intValue()
		}
		
		Integer myIntValue = 56; //call time java converted to this --> Integer.valueOf(56); //autoboxingfor(
		int myInt = myIntValue; //  java do this on calling time myInt.intValue (unboxing)
		
		
		ArrayList<Double> myDoubleValues = new ArrayList<>();
		for(double dbl = 0.0; dbl < 10.0; dbl+= 0.5) {
			//myDoubleValues.add(Double.valueOf(dbl));
			myDoubleValues.add(dbl); // behind the scene java change to (Double.valueOf(dbl)
		}
		for(int i = 0; i <  myDoubleValues.size(); i++) {
			//double value = myDoubleValues.get(i).doubleValue();
			double value = myDoubleValues.get(i); //behind the scene java add .doubleValue()
			System.out.println(i + " ---> " + value);
		}
	}

}
