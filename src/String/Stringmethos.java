package String;




public class Stringmethos {
    public static void main(String[] args){
        String s="manimegalai";
        System.out.println(s.length());
        System.out.println(s.equals("kalai"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.compareTo("ka"));
        System.out.println(s.compareTo("aaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(s.compareTo("manimegalai"));
        System.out.println(s.compareToIgnoreCase("MANIMEGALAI"));
        System.out.println(s.compareToIgnoreCase("KALAI"));
        System.out.println(s.compareToIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAA"));
        System.out.println(s.contains("mani"));
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("i"));
        System.out.println(s.substring(4));
        System.out.println(s.substring(4,10));
       s=s.replace("a","b");
        System.out.println(s);

        String s2="hi";
        s=s.concat(s2);
        System.out.println(s);
        System.out.println(s.indexOf("a",5));

    }
}
