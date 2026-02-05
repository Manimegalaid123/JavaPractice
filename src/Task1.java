import java.util.*;
public class Task1 {
    public static void prime(int n) {
        Boolean isprime = true;
        if (n <= 1) {
            System.out.println("the Number is not Prime ");
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
        }
        if (isprime) {
            System.out.println("the number is prime");
        } else {
            System.out.println("the Number is Not prime");
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Prime Number\n2.Number pattern\n3.Star Pattern\n4.Table\n5.Exist");
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the number to check prime or not");
                    int n=sc.nextInt();
                    prime(n);
                    break;
                case 2:
                    System.out.println("Enter the number for Number pattern");
                    int n1=sc.nextInt();
                    for(int i=0;i<n1;i++){
                        for(int j=0;j<i;j++){
                            System.out.print(j+1);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the number for * pattern");
                    int n2=sc.nextInt();
                    for(int i=0;i<n2;i++){
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Enter the number for table ");
                    int n4=sc.nextInt();
                    for(int i=1;i<11;i++){
                        System.out.println(i +" x "+n4+" = "+i*n4 );
                    }

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

       
    }
}
