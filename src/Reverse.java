import java.util.*;
class Show{
    void show(){
        System.out.println("this is from another class");
    }
}
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int rev=0;
        Integer a=10;
        Integer b=10;
        while(num!=0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        System.out.println("reversed number is"+ rev);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a==b);
    }
}
