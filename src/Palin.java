import java.util.Scanner;
import java.util.*;
public class Palin {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
    String s=sc.nextLine();
    int n=s.length();
//       while(i<n/2) {
//           if (s.charAt(i) != s.charAt(n - 1)) {
//               System.out.println("it is not palindrome");
//
//           } else {
//
//                   System.out.println("it is palindrome");
//               }
//               i++;
//           }
        boolean palindrome=true;
       for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                palindrome=false;
                break;
            }

        }
        if(palindrome){
            System.out.println("Its is palindrome");
        }else{
            System.out.println("Its is not palindrome");
        }

       }
}
