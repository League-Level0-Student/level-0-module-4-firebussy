//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
  int show=      JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
System.out.println(show);
if (show == 0) {
	JOptionPane.showMessageDialog(null, "Get Up Lazy Bones");
}else{
	int pane=      JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "", JOptionPane.YES_NO_OPTION);
	if(pane==0){
		JOptionPane.showMessageDialog(null,"Sleep in");
	}else{
		JOptionPane.showMessageDialog(null,"Go to Bed");
	}
}

        /*
         * Print sleep in if it is a vacation or a weekend. If itâ€™s a weekday,
         * print get up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}
