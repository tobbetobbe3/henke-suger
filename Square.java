import javax.swing.*;

public class Square {
	public static void main(String[]arg){
		int square;
		int pow = 0;
		int pow2 = 0;
		for (int i = 1; i <= 100; i++){
			square = (int)(Math.pow(i,2) + 0.5);
			pow = pow + square;
		} for (int i = 1; i <= 100; i++){
			pow2 = pow2 + i;
		} pow2 = (int)(Math.pow(pow2,2) + 0.5);
		int square2;
		square2 = pow2 - pow;
		System.out.print(square2);
	}
}
