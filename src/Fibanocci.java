import java.util.*;
public class Fibanocci {

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int  num=sc.nextInt();
        int f1=0;
        int f2=1;
        int f3=0;
        System.out.print(f1+" "+f2);

       for(int i=2;i<=num;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;


        }

    }
}
