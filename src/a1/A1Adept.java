package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Total number of items in store
		
		int itemCount = scan.nextInt();		
		
		// Array to store item names and prices
		
		String[] itemNames = new String[itemCount];
		double [] itemPrices = new double[itemCount];
		
		// Scan names and prices into arrays
		
		for (int i=0; i < itemCount; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		// Total number of customers
		
		int custCount = scan.nextInt();
		
		// Array to store customer names and price totals
		
		String[] custNames = new String[custCount];
		double [] custTotals = new double[custCount];

		//variable to track total cost
		double allTotal = 0.0;
		
		//for loops to add names and prices to array
		for (int x=0; x < custCount; x++) {
			custNames[x] = (scan.next() + " " + scan.next());
			// ^^ adding first and last names as one to custNames array
			int custItems = scan.nextInt();
			double custTotal = 0.0;
			for (int y=0; y < custItems; y++) {
				int itemNum = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = priceCheck(itemName, itemNames, itemPrices);
				custTotal += (itemNum * itemPrice);
			}
			// add each customer total to allTotal cost
		
			allTotal += custTotal;
			custTotals[x] = custTotal;
		} 
		
		
		// find the biggest spender by comparing everyones prices in the arrays just made
		String bigSpender = custNames[0];
		double bigAmount = custTotals[0];
		for (int z=0; z<custNames.length; z++) {
			if (custTotals[z] > bigAmount) {
				bigSpender = custNames[z];
				bigAmount = custTotals[z];
			}
		}
		System.out.println("Biggest: " + bigSpender + "(" + String.format("%.2f", bigAmount) + ")");
		
		
		// find the smallest spender by comparing everyones price in the arrays just made
		
		String smallSpender = custNames[0];
		double smallAmount = custTotals[0];
		for (int a=0; a<custNames.length; a++) {
			if (custTotals[a] < smallAmount) {
				smallSpender = custNames[a];
				smallAmount = custTotals[a];
			}
		}
		System.out.println("Smallest: " + smallSpender + "(" + String.format("%.2f", smallAmount) + ")");
	
	
		//find the average by dividing allTotal by array.length
		double avg = (allTotal/custNames.length);
		System.out.println("Average: " + String.format("%.2f", avg));

	}
		
		//method to match the item name to item price of same index in other array
		public static double priceCheck(String itemName, String[] itemNames, double[] itemPrices) {
			double price = 0.0;
			for (int i=0; i<itemNames.length; i++) {
				if(itemName.contentEquals(itemNames[i])) {
					price = itemPrices[i];
				}
			}
			return price;
		}
		}
		

