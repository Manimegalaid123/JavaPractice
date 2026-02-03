package String;

public class Poolcon {

        public  static void main(String[] args)
        {
            String s1 = "abc";
            String s2 = "abc";
            String s3=new String("abc");
            String s4=new String("abc");
            System.out.println(s1==s2);
            System.out.println(s1==s3);
            System.out.println(s1.equals(s2==s4));
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s3.equals(s1));// content
            System.out.println(s3==s4); // memory address check


            if (s1 == s2)
                System.out.println("Yes");
            else
                System.out.println("No");
            String str1=new String("hello");
            String str2=new String("hello");
            if (str1 == str2)
                System.out.println("Yes");
            else
                System.out.println("No");
            String s10="hello";

            String s11 = "welcome";
           s10.concat("hi");
            System.out.println(s10);// immutale

            s11=s10.concat(s11);  // we can assign only the string change


            System.out.println(s11);

            String str="kalai";
            String str4=" ";
            for(int i=str.length()-1;i>=0;i--){
                char c1=str.charAt(i);
                str4=str4.concat(Character.toString(c1));
            }
            System.out.println(str4);
        }
    }

