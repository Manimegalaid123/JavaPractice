import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        int add=num1+num2;
        System.out.println("Addtion:"+add);
        int sub=num1-num2;
        System.out.println("Subraction:"+sub);
        int mul=num1*num2;
        System.out.println("Multiplication:"+mul);
        if(num2==0){
            System.out.println(" divisor is 0 ");
        }else{
            double a=num1;
            double b=num2; // widening casting
            double div=a/b;
//            int x=a;
//            int y=b;  this not right because if we convert larger to small we must use the narrowing conversion
            System.out.println("Division:"+(int)div); // this narrowing casting
        }
        // calculator using switch


    }
}
