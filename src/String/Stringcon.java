package String;
/*
It is collection of characters or anything which enclosed with double quotes
it present is a class which is present inside java.lang package
String is immutable , becuase once object is created then values can't be modifies
 2 ways to declare string
 using
 string literal and new keyword
 reference mutable
 object immutable
 java 1995
 java 1.0 string buffer
 string buffer is muttable
 default capacity of StringBuffer is 16
 StringBuilder java 1.5
 StringBuilder is fast then buffer
 */
public class Stringcon {
    public static void main(String args[]){
        String s="hello";
        System.out.println(s);
        System.out.println(s.hashCode());
        s="welcome";
        System.out.println(s);
        System.out.println(s.hashCode());
        String ss="java";
        ss.concat("World");
        System.out.println(ss);
        StringBuffer st=new StringBuffer("Hello");
        st.append("world");
        st.insert(1,"Raja");
        System.out.println(st);
        st.append("value");
        StringBuilder sb=new StringBuilder("hi");
        sb.append("welcome");
        boolean result = false || true && false;
        System.out.println(result);
        int i = 0;
        for ( ; ; ) {
            if (i++ == 3) break;
        }
        System.out.println(i);


    }
}
