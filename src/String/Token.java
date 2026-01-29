package String;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args){
        //default constructor
        StringTokenizer s= new StringTokenizer("manime galai");
        System.out.println(s.countTokens());
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        System.out.println(s.countTokens());
// using delimter
        StringTokenizer s1=new StringTokenizer("mani*megala*d","*");
        while (s1.hasMoreTokens()) {

            System.out.println(s1.nextToken());
        }
        // return delimter
        StringTokenizer s3=new StringTokenizer("kalai@28080200@gmail@com","@",true);
        while(s3.hasMoreTokens()){
            System.out.println(s3.nextToken());
        }
    }
}
