

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 100000; i++) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String num=JOptionPane.showInputDialog("Give Me One Number");
String numb=JOptionPane.showInputDialog("Give Me Another Number");

int number=Integer.parseInt(num);
int nu=Integer.parseInt(numb);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
int answer=add(number,nu);
JOptionPane.showMessageDialog(null,answer);
}
if (operation==1) {
int answer=subtract(number,nu);
JOptionPane.showMessageDialog(null,answer);
} 	
if (operation==2) {
int answer=multiply(number,nu);
JOptionPane.showMessageDialog(null,answer);
}
if (operation==3) {
int answer=divide(number,nu);
JOptionPane.showMessageDialog(null,answer);
}}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static int add(int n,int book) {
	return n+book;
	
}
	// 4. Create similar methods for subtraction, multiplication and division.
static int subtract(int n,int book) {
	return n-book;
}
static int multiply(int n,int book) {
	return n*book;
}
static int divide(int n,int book) {
	return n/book;
}
}