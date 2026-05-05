package HOMEWORK;

import javax.swing.JOptionPane;
public class AverageCalculatorGUI {
	public static void main (String[]args) {
	
	String n1=JOptionPane.showInputDialog(null,
			"Enter a score 1","Box input",JOptionPane.QUESTION_MESSAGE);
	int s1 = Integer.parseInt(n1);
	
	String n2=JOptionPane.showInputDialog(null,
			"Enter a score 2","Box input",JOptionPane.QUESTION_MESSAGE);
	int s2 =Integer.parseInt(n2);
	
	String n3=JOptionPane.showInputDialog(null,
			"Enter a score 3","Box input",JOptionPane.QUESTION_MESSAGE);
	int s3 =Integer.parseInt(n3);
	
	String n4=JOptionPane.showInputDialog(null,
			"Enter a score 4","Box input",JOptionPane.QUESTION_MESSAGE);
	int s4 =Integer.parseInt(n4);
	
	String n5=JOptionPane.showInputDialog(null,
			"Enter a score 5","Box input",JOptionPane.QUESTION_MESSAGE);
	int s5 =Integer.parseInt(n5);
	
	double avg= (s1+s2+s3+s4+s5)/5.0;
	
	JOptionPane.showMessageDialog(null, "The Average is: " + avg);
	
	
	
	
	}

}
