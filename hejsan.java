import javax.swing.*;
public class hejsan{
	public static void main (String[]arg){
	String bajskorv = JOptionPane.showInputDialog("numer du vill multiplicera med 5");
	int kung = Integer.parseInt(bajskorv);
	JOptionPane.showMessageDialog("janis röv \n" + kung*5);
	}
}