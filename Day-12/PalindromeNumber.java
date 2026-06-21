public class PalindromeNumber {

    
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int num = 121;

        if (isPalindrome(num))
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is Not a Palindrome");
    }
}