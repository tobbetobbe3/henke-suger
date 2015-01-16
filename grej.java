import javax.swing.*;

public class grej{
	public static void main(String[]arg){
		int check = 0;
		for (int i = 2520; true; i++){
			for (int j = 1; j <= 20; j++){
				if (i % j > 0) {
					break;
				}else if (j == 20){
					check = j;
					System.out.println(i);
					break;
				}
			}
			if (check == 20){
				break;
			}
		}
	}
}