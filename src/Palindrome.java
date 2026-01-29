import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int OGnum=num;
        int rev=0;
        while(num!=0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        if(rev==OGnum){
            System.out.println("the number "+OGnum+ " is palindrome "+rev);
        }else{
            System.out.println("the number "+OGnum+" is not palindrome "+rev);
        }
        Show obj= new Show();
        obj.show();


    }
}
