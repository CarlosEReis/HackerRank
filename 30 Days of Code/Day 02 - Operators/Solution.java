/**
 * 
 *	@author Carlos Reis
 *	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */

public class Solution {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

		// Write your calculation code here.
        double tip, tax;
        tip = mealCost * tipPercent / 100;
        tax = mealCost * taxPercent / 100;

		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round(mealCost + tip + tax);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}
}
