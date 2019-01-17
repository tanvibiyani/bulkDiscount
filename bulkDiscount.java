/* Tanvi Biyani
 * Net ID: txb160430
 * ITSS 3311.002
 * Hw6 - 3)total T-shirt cost 
 */

import java.util.Scanner;

public class bulkDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # of T-shirts: ");
		int numShirt = sc.nextInt();
		double cost = 0;
		double total = 0;
		
		
		if(numShirt >= 100 && numShirt < 500) {
			cost = 4.99 * numShirt;
			System.out.println("Initial cost: " + "$" + cost);
		}
		
		if(numShirt >= 500 && numShirt < 1000) {
			cost = 3.99 * numShirt;
			System.out.println("Initial cost: " + "$" + cost);
		}
		
		if(numShirt >= 1000 && numShirt < 2500) {
			cost = 2.99 * numShirt;
			System.out.println("Initial cost: " + "$" + cost);
		}
		
		if(numShirt >= 2500 && numShirt < 5000) {
			cost = 2.49 * numShirt;
			System.out.println("Initial cost: " + "$" + cost);
		}
		
		if(numShirt >= 5000) {
			cost = 1.99 * numShirt;
			System.out.println("Initial cost: " + "$" + cost);
		}
		
		
		if(cost >= 200) {
			total = cost * .85;
			
		}
		
		if(cost >= 100) {
			total = cost * .90;
		}
		
		else {
			System.out.println("Not available");
			System.exit(1);
		}
		
		System.out.println("Total cost after discount: " + "$" + total);
	}
	
	}

		




