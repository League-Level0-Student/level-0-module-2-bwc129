package _04_spot_the_error;

import java.util.Random;

public class FixTheRandom {

	// This program is supposed to get a random number between 5 and 10 and print a different message for each number.
	// BUT it's not working. If you don't believe me, try running it.
	// Change ONE line of code to fix this program.
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numnber = random.nextInt(11);
		System.out.println(numnber);
		if (numnber == 5) {
			System.out.println("FIVE");
		}  if (numnber == 6) {
			System.out.println("SIX");
		}  if (numnber == 7) {
			System.out.println("SEVEN");
		}  if (numnber == 8) {
			System.out.println("EIGHT");
		}  if (numnber == 9) {
			System.out.println("NINE");
		}  if (numnber == 10) {
			System.out.println("TEN");
		}
	}
	
	
}
