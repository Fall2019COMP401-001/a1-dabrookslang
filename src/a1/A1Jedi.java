package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

				// Total number of items in store
		
				int itemCount = scan.nextInt();		
				
				// Array to store item names and prices
				
				ArrayList<String> itemNames = new ArrayList<String>();
				Double [] itemPrices = new Double[itemCount];
				
				// Scan names and prices into arrays
				
				for (int i=0; i < itemCount; i++) {
					itemNames.add(scan.next());
					itemPrices[i] = scan.nextDouble();
				}
				
				// for loops to take in number of customers, names (irrelevant), how many items bought, and number of cust who bought that item
				
				int custCount = scan.nextInt();				
				String[] custNames = new String[custCount];
				int[] totalBought = new int[itemCount];
				// counter array for items
				int[] numberOfCust = new int[itemCount];
				
				for (int i=0; i<custCount; i++) {
					boolean[] prevBought = new boolean[itemCount];
					//SCan cust names into array
					custNames[i] = scan.next() + " " + scan.next();
					// Take count of items bought by cust
					int custItemCount = scan.nextInt();
					// How many and which of each item and use boolean test to add number of customers who bought each item
					for (int x=0; x<custItemCount; x++) {
						int numberOfItem = scan.nextInt();
						int index = itemNames.indexOf(scan.next());
						if (prevBought[index] == false) {
							prevBought[index] = true;
							numberOfCust[index] += 1;
						} totalBought[index] += numberOfItem;
					}
				}
					end
					//Print message for count of items
					for (int i=0; i <itemCount; i++) {
						if(numberOfCust[i]==0) {
							System.out.println("No customers bought " + itemNames.get(i));
						} else { System.out.println(numberOfCust[i] + " customers bought " + totalBought[i] + " " + itemNames.get(i));
					}
					
				}
	}
}
