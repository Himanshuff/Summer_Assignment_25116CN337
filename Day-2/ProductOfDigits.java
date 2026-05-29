//Q7
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        // Find product of digits
        while (num != 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        // Display result
        System.out.println("Product of digits = " + product);

        sc.close();
    }
}