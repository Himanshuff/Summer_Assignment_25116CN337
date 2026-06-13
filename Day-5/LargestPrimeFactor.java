import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestFactor = 0;

    
        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }

        
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }

        
        if (num > 2) {
            largestFactor = num;
        }

        System.out.println("Largest Prime Factor = " + largestFactor);

        sc.close();
    }
}