import javax.swing.*;

public class Singla{
	public static void main (String[]arg){
		int x = (int) (Math.random() * 2);
		String input = JOptionPane.showInputDialog("krona eller klave");
		if (input.equals("krona") && x == 1){
			JOptionPane.showMessageDialog(null, "du valde krona");
			JOptionPane.showMessageDialog(null, "det blev klave");
			JOptionPane.showMessageDialog(null, "du hade fel");
		}else if(input.equals("klave") && x ==  1){
			JOptionPane.showMessageDialog(null, "du valde klave");
			JOptionPane.showMessageDialog(null, "det blev klave");
			JOptionPane.showMessageDialog(null, "du hade rätt");
		}else if(input.equals("krona") && x == 0){
			JOptionPane.showMessageDialog(null, "du valde krona");
			JOptionPane.showMessageDialog(null, "det blev krona");
			JOptionPane.showMessageDialog(null, "du hade rätt");
		}else if(input.equals("klave") && x == 1){
			JOptionPane.showMessageDialog(null, "du valde klave");
			JOptionPane.showMessageDialog(null, "det blev krona");
			JOptionPane.showMessageDialog(null, "du hade fel");
		}else{
			JOptionPane.showMessageDialog(null, "stava rätt dit jävla retard");
		}
	}
}