 class Test{
    int length;
    int width;
    static String name;
//    static{
//        name="rectangle";
//        System.out.println("jeeva");  // class load then main run
//    }
     {
         System.out.println("not");   // not static block it run whenver
     }
//    Test(){
//        length=20;
//        width=40;
//        System.out.println(length);
//        System.out.println(width);
//
//    }

    public  void show(){
        System.out.println(length+" : "+width+" "+name);
    }
     public static void show1(Test obj1){
//System.out.println(length+" : "+width+" "+name); cannot access the non static
// variable inside the static methods
         System.out.println(name);
         System.out.println("inside static methods");
         System.out.println(obj1.length+" "+obj1.width);

     }
}
public class Static {

    public static void main(String args[])   throws ClassNotFoundException{
//        Class.forName("Test");
//        System.out.println("hi");
         Test obj1=new  Test();
         obj1.length=10;
         obj1.width=10;
         obj1.name="rectangle";
         Test obj2=new Test();
         obj2.length=30;
         obj2.width=40;
         obj2.name="square";
         obj1.show();
         obj2.show();
//         Test.show1();
         // we can indirectly access the non static variable in statuic methods
        Test.show1(obj1);
//         obj1.show1();
    }
}
