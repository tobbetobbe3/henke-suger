import javax.swing.*;

public class sats {
	public static void main(String[]arg) {
		int x = 1;
		int y = 2;
		int z = 0;
		int xyz = 2;
		while(x < 4000000 && y < 4000000 && z < 4000000){
			z = x + y;
			x = y + z;
			y = z + x;
			if(z % 2 == 0){
				xyz = z + xyz;
			}else if(x % 2 == 0){
				xyz = x + xyz;
			}else if(y % 2 == 0){
				xyz = y + xyz;
			}else{
				break;
			}
		}
	System.out.print(xyz);
	}
}