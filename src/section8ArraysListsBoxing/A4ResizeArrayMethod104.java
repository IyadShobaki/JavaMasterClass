//Not productive way.
package section8ArraysListsBoxing;

import java.util.ArrayList;
import java.util.Scanner;

public class A4ResizeArrayMethod104 {
	private static Scanner scanner = new Scanner(System.in);
//	private static int[] baseData = new int[10];
	
	private static A4GroceryList104 groceryList = new A4GroceryList104();
	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
		    case 1:
		    	groceryList.printGroceryList();
		    	break;
		    case 2:
		    	addItem();
		    	break;
		    case 3:
		    	modifyItem();
		    	break;
		    case 4:
		    	removeItem();
		    	break;
		    case 5:
		    	searchForItem();
		    	break;
		    case 6:
		    	processArrayList();
		    	break;
		    case 7:
		    	quit= true;
		    	break;
			}
		}
		
//		System.out.println("Enter 10 integers:");
//		getInput();
//		printArray(baseData);
//		resizeArray();
//		//System.out.println("Enter 12 integers:");
//		//getInput();
//		baseData[10] = 67;
//		baseData[11] = 34;
//		printArray(baseData);
		
		

	}
	
	
	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - to Print choice options.");
		System.out.println("\t 1 - to Print the list of grocery items.");
		System.out.println("\t 2 - to add an item to the list.");
		System.out.println("\t 3 - to modify an item in the list.");
		System.out.println("\t 4 - to remove an item from the list.");
		System.out.println("\t 5 - to search for an item in the list.");
		System.out.println("\t 6 - copy arrayList to another list.");
		System.out.println("\t 7 - to quit the application.");
	}
	
	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
		
	}
	public static void modifyItem() {
		//System.out.print("Enter item number: ");
		//int itemNo = scanner.nextInt();
		System.out.print("Enter current item name: ");
		String currentItem = scanner.nextLine();
		//scanner.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(currentItem, newItem);
		
	}
	public static void removeItem() {
//		System.out.print("Enter item number: ");
//		int itemNo = scanner.nextInt();
		
		System.out.print("Enter item name: ");
		String item = scanner.nextLine();
//		scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}
	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		//if(groceryList.findItem(searchItem) != null) {
		if(groceryList.onFile(searchItem)) {
			System.out.println("Found " + searchItem + " in our grocery list");
		}else {
			System.out.println(searchItem + " is not in the shopping list");
		}
	}
	public static void processArrayList() {
		//first way to copy arrayList
		ArrayList<String> newArray = new ArrayList<>();
		newArray.addAll(groceryList.getGroceryList());
		
		//second way
		ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
		
		//third way
		String[] myArrayStrings = new String[groceryList.getGroceryList().size()];
		myArrayStrings = groceryList.getGroceryList().toArray(myArrayStrings);
		
	}
	
	
//	public static void getInput() {
//		for(int i= 0; i < baseData.length; i++) {
//			baseData[i] = scanner.nextInt();
//		}
//	}
//	private static void printArray(int[] arr) {
//		for(int i =0; i < arr.length; i++)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
//	
//	private static void resizeArray() {
//		int[] original = baseData;
//		baseData = new int[12];
//		for(int i =0; i < original.length; i ++) {
//			baseData[i] = original[i];
//		}
//	}

}
