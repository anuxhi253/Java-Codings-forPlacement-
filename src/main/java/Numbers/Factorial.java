package Numbers;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();   // input number
        int f = 1;              // factorial result

        for(int i = 1; i <= n; i++) {
            f = f * i;          // multiply each number
        }

        System.out.println("Factorial = " + f);
    }
}
