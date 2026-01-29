package String;

public class Intro {
    public static void main(String[] args){
        String s=new String(); //heap memory
        String s1="hello"; //Staric memory
        s="hi";


        System.out.println(s);
        System.out.println(s1);
       // default constructor
        StringBuffer str=new StringBuffer();
        str.append("welcome");
        System.out.println(str);
        // constuctor with specified capacity
        StringBuffer s2=new StringBuffer(2);
        s2.append("mani");
        s2.append(" ");
        s2.append("megalai"); //append
        s2.append("megalai");
        System.out.println(s2.capacity()); //capacity
        s2.trimToSize(); // trimTosize
        System.out.println("afte using trintoSize"+ s2.capacity());
        System.out.println(s2.length());  //length
        System.out.println(s2);
        StringBuffer s3=new StringBuffer("kongu engg");
        System.out.println(s3);
        System.out.println("methods");
        StringBuffer s5=new StringBuffer();
        s5.append("Manimegalai");
        System.out.println(s5);
        s5.insert(11,"D");  //insert
        System.out.println(s5);
        s5.replace(6,7,"k"); //replace
        System.out.println(s5);
        s5.delete(0,6);  //delete
        System.out.println(s5);
        System.out.println(s5.reverse()); //reverse
        System.out.println(s5.substring(2));  // it work both start and end
        s3.setLength(5);
        System.out.println(s3);
        s3.setCharAt(2,'k'); // we use single quation  it also replae
        System.out.println(s3);
        System.out.println( s3.indexOf("o"));




    }
}
