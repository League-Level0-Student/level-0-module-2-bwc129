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
		//String thing =  JOptionPane.showInputDialog(ranNumber);
		// 2. Repeat all the code above 10 times
		 if (ranNumber ==0) {
		
			 String h =  JOptionPane.showInputDialog("nice hair");}
		
		 if (ranNumber ==1) {
				
			 String hi =  JOptionPane.showInputDialog("cool shoes");}
		 
		 if (ranNumber ==2) {
				
			 String hii =  JOptionPane.showInputDialog("you are smart");}
		
		 if (ranNumber ==3) {
				
			 String hiii =  JOptionPane.showInputDialog("your cool");}
		
		 if (ranNumber ==4) {
				
			 String hiiii =  JOptionPane.showInputDialog("i like your shirt");}
		// 3. Find someone to test your punch on. They won't like it :(
	}
}
