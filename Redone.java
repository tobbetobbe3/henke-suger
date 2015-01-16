import javax.swing.*;

public class Redone{
	public static void main (String[]arg){
		String input = JOptionPane.showInputDialog("Sten Sax Påse?");
		
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
			JOptionPane.showMessageDialog(null, "dator valde påse");
			JOptionPane.showMessageDialog(null, "du förlora");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 0){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde sten");
			JOptionPane.showMessageDialog(null, "du förlora");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 1){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde sax");
			JOptionPane.showMessageDialog(null, "det blir oavgjort");
		}else if(input.equals("sax") || input.equals("sAX") || input.equals("SAX") || input.equals("Sax") && datorVal == 2){
			JOptionPane.showMessageDialog(null, "du valde sax");
			JOptionPane.showMessageDialog(null, "dator valde påse");
			JOptionPane.showMessageDialog(null, "du van");
		}else if(input.equals("påse") || input.equals("pÅSE") || input.equals("PÅSE") || input.equals("Påse") && datorVal == 0){
			JOptionPane.showMessageDialog(null, "du valde påse");
			JOptionPane.showMessageDialog(null, "dator valde påse");
			JOptionPane.showMessageDialog(null, "det blir oavgjort");
		}else if(input.equals("påse") || input.equals("pÅSE") || input.equals("PÅSE") || input.equals("Påse") && datorVal == 1){
			JOptionPane.showMessageDialog(null, "du valde påse");
			JOptionPane.showMessageDialog(null, "dator valde sten");
			JOptionPane.showMessageDialog(null, "du van");
		}else if(input.equals("påse") || input.equals("pÅSE") || input.equals("PÅSE") || input.equals("Påse") && datorVal == 2){
			JOptionPane.showMessageDialog(null, "du valde påse");
			JOptionPane.showMessageDialog(null, "dator valde sax");
			JOptionPane.showMessageDialog(null, "du förlora");	
		 } else {
			JOptionPane.showMessageDialog(null, "awful input. u suck.");
		}
	}
}