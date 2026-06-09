import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0, second = 1, fib = 0;

        if (n == 1) {
            fib = first;
        } else if (n == 2) {
            fib = second;
        } else {
            for (int i = 3; i <= n; i++) {
                fib = first + second;
                first = second;
                second = fib;
            }
        }

        System.out.println("The " + n + "th Fibonacci term is: " + fib);

        sc.close();
    }
}