import javax.swing.*;

public class song{
	public static void main (String[]arg){
		long input = Long.parseLong(JOptionPane.showInputDialog(""));
		long largestPrime = 0;
		long largeNumber = input;
		for(long i = 2; (i * i) < largeNumber; i++){
			if(input % i == 0){
				input = input/i;
				largestPrime = i;
				i = 2;
			}
		}
		System.out.print(largestPrime);
	}
}