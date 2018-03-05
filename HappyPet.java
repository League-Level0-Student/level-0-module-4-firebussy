//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int hapinessLevel=0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet=JOptionPane.showInputDialog("What Pet Do You Want To Buy From The Store");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Play", "Walk", "Groom", "Clean Up Poop" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	Food();
}

if (task==1) {
	Water();
}
if (task==2) {
	Play();
}
if (task==3) {
	Walk();
}
if (task==4) {
	Groom();

}
if (task==5) {
	CleanUpPoop();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (hapinessLevel==25) {
	JOptionPane.showMessageDialog(null, "You Love Your Pet");
	break;
}}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void Food(){
		System.out.println("Your Pet Is Full");
		hapinessLevel+=2;
	}
	static void Water(){
		System.out.println("Your Pet Is Healthy");
		hapinessLevel+=2;
	}
	static void Play(){
		System.out.println("Your Pet Is Tired");
		hapinessLevel+=3;
	}
	static void Walk(){
		System.out.println("Your Pet Is Jumpy");
		hapinessLevel+=3;
	}
	static void Groom(){
		System.out.println("Your Pet Is Thankful");
		hapinessLevel+=4;
	}
	static void CleanUpPoop(){
		System.out.println("Your Pet Is Happy");
		hapinessLevel+=5;
	}
}
	