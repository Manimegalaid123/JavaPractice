import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        char s[]=ss.toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<=j){
            if(!Character.isLetter(s[i])){
                i++;
            }if(!Character.isLetter(s[j])){
                j--;
            }else{
                char temp=s[i];
                s[i]=s[j];
                s[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(s);
    }
}
