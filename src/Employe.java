import java.util.*;
public class Employe {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income");
        int n=sc.nextInt();
        if(n<=250000){
            System.out.println("No Tax");
        }
        else if(n>=250000 && n<500000){
            System.out.println( "Total Tax:"+n+n*0.05);
        }else if(n>=500000 && n<600000){
            System.out.println("Total Tax:"+n+n*0.2);
        }else{
            System.out.println("Total Tax:"+n+n*0.3);
        }

        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age <4){
            System.out.println("Poor");
        }else if(age >=4  && age <6){
            System.out.println("Avergae");
        }else if(age >=6 && age<8){
            System.out.println("Good");
        }else {
            System.out.println("Excellent");
        }
    }
}
