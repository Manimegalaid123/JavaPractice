import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean isPalindrome=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome=false;
            }
            i++;
            j--;
        }
        if (isPalindrome) {

            System.out.println("the String is Palindorme");
        }
        else{
            System.out.println("The string is Not palindrome");
        }
    }
}
