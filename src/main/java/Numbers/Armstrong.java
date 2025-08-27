package Numbers;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int t = n;   // temp copy of number
        int s = 0;   // sum of cubes

        while(n > 0) {
            int d = n % 10;   //last digit
            s = s + (d * d * d);  // cube and add
            n = n / 10; //remove digit
        }

        if(s == t) {
            System.out.println(t + " is an Armstrong number");
        } else {
            System.out.println(t + " is NOT an Armstrong number");
        }
    }
}

