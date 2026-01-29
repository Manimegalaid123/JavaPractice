import java.util.*;
public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0) {
            if (n % 2 == 0) {
                System.out.println(n + "Even divisiable by 5");
            } else {
                System.out.println("ODD");
            }
        } else if (n % 3 == 0) {
            if (n % 2 == 0){
                System.out.println(n + "Even diviable by 3");
        } else {
            System.out.println("odd");
        }
    }
    else{
            System.out.println("num not divided by 3 or 5");
        }
    }
}
