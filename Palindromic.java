import javax.swing.*;

public class Palindromic{
	public static void main(String[]arg){
		int pal;
		int assohenke = 1;
		for (int i = 100; i <= 999; i++){
			for (int j = 100; j <= 999; j++){
				pal = j * i;
				String original = "" + pal;
				String reverse = "";
				
				for (int k = original.length() - 1; k >= 0; k--){
					char s = original.charAt(k);
					reverse += s;
				} int fuckujava = Integer.parseInt(original);
				if (original.equals(reverse) && fuckujava > assohenke){
					assohenke = fuckujava;
				}
			}
		}
		System.out.print(assohenke);
	}
}