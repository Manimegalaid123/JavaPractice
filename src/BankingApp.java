import java.util.*;
public class BankingApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account Type (savings or current)");
        String account = sc.nextLine();
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        if (account.toLowerCase() == "savings") {
            if (balance > 10000) {
                balance = balance + balance * 0.05;
                System.out.println("final Balance:" +balance);
            } else {
                balance = balance + balance * 0.03;
                System.out.println("final Balance:" +balance);
            }
        } else {
            if (balance > 50000 && balance < 100000) {
                balance = balance + balance * 0.02;
                System.out.println("final Balance:" +balance);

            } else {
                balance = balance + balance * 0.035;
                System.out.println("final Balance:" +balance);
            }
        }
    }
}
