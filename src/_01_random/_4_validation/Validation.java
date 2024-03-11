//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random ranMaker = new Random();
		
		int ranNumber = ranMaker.nextInt(5);
		
		System.out.println(ranNumber);

		// 1. Use each value of ranNumber to give the user a random compliment.
		String riddle =  JOptionPane.showInputDialog(ranMaker);
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
