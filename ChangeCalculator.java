//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String show=JOptionPane.showInputDialog("How many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int q=Integer.parseInt(show);
		// Ask the user how many dimes they have, and convert their answer
String mes=JOptionPane.showInputDialog("How many dimes do you have");
int e=Integer.parseInt(mes);
		// Ask the user how many quarters they have, and convert their answer
String pane=JOptionPane.showInputDialog("How many quaters do you have");
int z=Integer.parseInt(pane);
		// Calculate how much money the user has and save it in a double variable 
//5 * 0.05
double totalnickels=q*0.05;
double totaldimes=e*0.10;
double totalquaters=z*0.25;
		// Tell the user how much money they have
System.out.println(totalnickels+totaldimes+totalquaters);
	}
}

