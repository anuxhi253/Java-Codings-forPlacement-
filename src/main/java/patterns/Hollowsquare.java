package patterns;
import java.util.Scanner;
public class Hollowsquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 0; i <=row; i++) {
			for (int j = 0; j <=col; j++) 
				if((i==0|| i==col) || (j==0 || j==col))
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
			
		}
	}
}

		