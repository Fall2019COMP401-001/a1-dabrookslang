package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Total number of customers
		
		int count = scan.nextInt();
		
		//Array to store orders
		
		String[] orders = new String[count];
		

		for (int i=0; i<orders.length; i++) {
			String firstnames = scan.next();
			String lastnames = scan.next();
			String itemname = "";
			Double price = 0.0;
			int items = 0;
			Double total = 0.0;
			char initial = firstnames.charAt(0);
			int number = scan.nextInt();
				for (int x=0; x<number; x++) {
					items = scan.nextInt();
					itemname = scan.next();
					price = scan.nextDouble();
					total += items*price;
		}
				String quad = String.format("%.2f", total);
				System.out.println(initial + ". " + lastnames + ": " + quad);
		}
	scan.close();	
	}
}
