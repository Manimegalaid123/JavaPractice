import java.util.Scanner;

import java.util.*;
public class Calci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println("enter choice");
        String choice=sc.nextLine();
        switch(choice){
            case "Add":
                System.out.println("Addtion"+ (num1+num2));
                break;
            case "Sub":
                System.out.println("Subraction"+(num1-num2));
                break;
            case "Mul":
                System.out.println("Multiplication"+(num1*num2));
                break;
            case "Div":
                if(num2==0){
                    System.out.println("divisor is 0");
                }else{
                    double a=num1;
                    double b=num2;
                    System.out.println("Division"+a/b);
                }
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }


}
