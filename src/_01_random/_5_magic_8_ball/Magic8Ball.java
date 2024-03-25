//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {

	// 2. Get the user to enter a question for the 8 ball to answer
	String question = JOptionPane.showInputDialog("ask me a question");
	
	
	Random ranMaker = new Random();
	
	int ranNumber = ranMaker.nextInt(6);
	
	System.out.println(ranNumber);


	if (ranNumber == 0) {
		String h = JOptionPane.showInputDialog("no");}
		
	if (ranNumber ==1) {
		String h = JOptionPane.showInputDialog("yes");}
	
	if (ranNumber == 2) {
		String h = JOptionPane.showInputDialog("maybe later");}
	
	if (ranNumber == 3) {
	String h = JOptionPane.showInputDialog("you are sigma");}
	
	if (ranNumber == 4) {
		String h = JOptionPane.showInputDialog("you are him");}

	if (ranNumber == 5) {
		String h = JOptionPane.showInputDialog("get a life");}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
