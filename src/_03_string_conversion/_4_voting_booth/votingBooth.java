package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String question= JOptionPane.showInputDialog("how old are you");
		int questionAsInt = Integer.parseInt(question);
		
		if (questionAsInt >=18)	{
		
			String question2= JOptionPane.showInputDialog("who should be the president");}
		
		if (questionAsInt <=17) {
			String question25= JOptionPane.showInputDialog("no one cares what you think");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
