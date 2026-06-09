package mytry;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stores elements in order

		//Allows duplicates

		//Index-based (like array but grows automatically)
		
	        ArrayList<String> names = new ArrayList<>();

	        names.add("Rama");
	        names.add("Savita");
	        names.add("Kavita"); // duplicates allowed

	        System.out.println("List: " + names);
	        System.out.println("First element: " + names.get(0));

	}

}
