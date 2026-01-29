public class TypeCon {
   public static void main(String args[]) { // Entry point

//
//        int num = 0b100;
//        int num2=0x4F;
//        System.out.println(num);
//       System.out.println(num2);
//       // type casting and conversion
//
//    byte a=123;
//    int b=12;
//    b=a; //widening conversion
//       byte c=(byte)b; // narrowing this called casting
//
//
////   int a1=130;
////   byte b1=(byte)a1;
////   float x=5.6f;
////   int y=(int)x; // loss the after decimal number
//
//       int a1=190;
//       byte b1=(byte)a1;
//       int x=10;
//       int y=11;
//
//       byte p=100;
//       byte q=70;
//       int res=p*q;  // type promation
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(c);
//       System.out.println(a1);
//       System.out.println(b1);
//       System.out.println(x==y);
//       System.out.println(res);
//       System.out.println("1"+2+3);
//       System.out.println(2+3+"1");
//
       int x1=9;
       x1++;
       int a=7;
       int b=2;
       int res=a+b;
       System.out.println(x1++);
       System.out.println(x1++);
       System.out.println(x1);
       System.out.println(a==b);
       System.out.println(res);
       if(a>b){
           System.out.println("if block");
       }
       if(false)

           System.out.println("after if block");
           System.out.println("after else");
           String result =(5%2==0)? "even":"odd";
       System.out.println(result);
       int i=1;
       while(i<4){

           System.out.println("hi"+i);
           i++;
           int j=1;
           while(j<=3){
               System.out.println("hello");
               j++;
           }

       }
       System.out.println(i);
       //System.out.println(j);
       for(int k=-1;k<=5;k++){
           System.out.println(k);
       }
    }
}
