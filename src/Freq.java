import java.util.*;
public class Freq {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
      int count[]=new int[26];
      Arrays.fill(count,0);
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          count['a'-c]++;
      }
        System.out.println(Arrays.toString(count));
    }
}
