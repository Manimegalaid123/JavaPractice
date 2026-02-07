import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int Orgnum = sc.nextInt();
        int n = Orgnum;
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;

        }
        if (rev == Orgnum) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
    }
}
