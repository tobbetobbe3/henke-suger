import javax.swing.*;

public class Redone{
	public static void main (String[]arg){
		String input = JOptionPane.showInputDialog("Sten Sax P�se?");
		
		int datorVal = (int)(Math.random() * 3 );
	
		if (input.equals("sten") || input.equals("s") || input.equals("STEN") || input.equals("Sten") && datorVal == 0){
			JOptionPane.showMessageDialog(null, "du valde sten");
			JOptionPane.showMessageDialog(null, "dator valde sax");
			JOptionPane.showMessageDialog(null, "du van");
		}else if(input.equals("sten") || input.equals("s") || input.equals("STEN") || input.equals("Sten") && datorVal == 1){
			JOptionPane.showMessageDialog(null, "du valde sten");
			JOptionPane.showMessageDialog(null, "dator valde sten");
			JOptionPane.showMessageDialog(null, "det blir oavgjort");
		}else if(input.equals("sten") || input.equals("s") || input.equals("STEN") || input.equals("Sten") && datorVal == 2){
			JOptionPane.showMessageDialog(null, "du valde sten");
			JOptionPane.showMessageDialog(null, "dator valde p�se");
			JOptionPane.showMessageDialog(null, "du f�rlora");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 0){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde sten");
			JOptionPane.showMessageDialog(null, "du f�rlora");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 1){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde sax");
			JOptionPane.showMessageDialog(null, "det blir oavgjort");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 2){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde p�se");
			JOptionPane.showMessageDialog(null, "du van");
		}else if(input.equals("p�se") || input.equals("p�SE") || input.equals("P�SE") || input.equals("P�se") && datorVal == 0){
			JOptionPane.showMessageDialog(null, "du valde p�se");
			JOptionPane.showMessageDialog(null, "dator valde p�se");
			JOptionPane.showMessageDialog(null, "det blir oavgjort");
		}else if(input.equals("p�se") || input.equals("p�SE") || input.equals("P�SE") || input.equals("P�se") && datorVal == 1){
			JOptionPane.showMessageDialog(null, "du valde p�se");
			JOptionPane.showMessageDialog(null, "dator valde sten");
			JOptionPane.showMessageDialog(null, "du van");
		}else if(input.equals("p�se") || input.equals("p�SE") || input.equals("P�SE") || input.equals("P�se") && datorVal == 2){
			JOptionPane.showMessageDialog(null, "du valde p�se");
			JOptionPane.showMessageDialog(null, "dator valde sax");
			JOptionPane.showMessageDialog(null, "du f�rlora");	
		 } else {
			JOptionPane.showMessageDialog(null, "awful input. u suck.");
		}
	}
}