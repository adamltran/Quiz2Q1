package pkg;
import java.util.Scanner;

public class Tuition {

	public Tuition() {
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter initial tuition.");
		double iTuition = input.nextDouble();
		
		System.out.println("Enter the percent increase.");
		double percentIncrease = (input.nextDouble()/100) + 1;
		
		double totalTuition = iTuition;
		double Total = iTuition;
		for (int i = 1; i < 4; i++) {
			double tuition = iTuition * Math.pow(percentIncrease, i);
			totalTuition = totalTuition + tuition;
		}
		
		System.out.printf("Total Tuition over 4 years is: %.2f", totalTuition);
		

	}

}
