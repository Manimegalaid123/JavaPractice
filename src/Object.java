//class Cal{
//    public int add(int a,int b){
//        System.out.println(a+b);
//        return 1;
//    }
//}

public class Object {
   static void add(){
        System.out.println("hello"); // static methods
    }
    public void display(){
       add();                         //
    }
    public String check(int n){
       if(n>5)
           return "Pen";
       return "Nothing";       // if the return is excute it immediately terminate the methods
    }
    public static void main(String a[]){
//       Cal obj=new Cal();
//       obj.add(8,9);
        Object obj=new Object();
        obj.display();
        System.out.println(obj.check(5));
//  if(2>5)
//      System.out.println("hi");
//      System.out.println("always");
//        System.out.println("ll");
    }
}
