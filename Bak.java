import javax.swing.*;

public class Bak {
	public static void main (String[] arg) {
		String ord = JOptionPane.showInputDialog("");
		for (int i = ord.length() - 1; i >= 0; i--){
			char s = ord.charAt(i);
			System.out.print(s);
		}
	}
}