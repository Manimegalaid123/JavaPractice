import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int c=0;
        int t=n;
        while(t!=0){
            c++;
            t=t/10;
        }
        System.out.println(c);
        int temp=n;
        int sum=0;
        while(temp!=0){
            int dig=temp%10;
            sum=sum+(int)Math.pow(dig,c);

            temp=temp/10;
        }
        if(sum==n){
            System.out.println("the number is Armstrong");
        }else{
            System.out.println("Not ArmStrong");
        }

    }
}
