public class PerfectNumber {

    
    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int num = 28;

        if (isPerfect(num))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is Not a Perfect Number");
    }
}