public class ArmstrongNumber {

    
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit; // cube of digit
            n /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is Not an Armstrong Number");
    }
}