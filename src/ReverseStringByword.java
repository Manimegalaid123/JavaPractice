import java.util.Scanner;

public class ReverseStringByword {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        String []s=ss.split(" ");

        for(int i=0;i<s.length;i++){

            char w[]=s[i].toCharArray();
            int x=0;
            int y=w.length-1;
            while(x<y){
                char t=w[x];
                w[x]=w[y];
                w[y]=t;
                x++;
                y--;
            }
            s[i]=new String(w);
        }
       for(String st:s){
           System.out.print(st+" ");
       }
    }
}
