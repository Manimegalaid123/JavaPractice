class Mark{
    int num;
    public void show(){
        System.out.println("show methos");

    }
    class Study{
        public void demo(){
            System.out.println("demo");
        }
    }
        }
   class Anonmousy{
    public void display(){
        System.out.println("this is display1");
    }
    public void display1(){
        System.out.println("this");
    }
   }

public class InnerClass {
    public static void main(String []args){
         Mark obj1=new Mark();
//         obj.demo();  // we cannot acces with outer class object
        // outerClass.innerClass objname= outerclassobject.new innerclass();
        Mark.Study obj=obj1.new Study(); // object creation
        obj.demo();
        obj1.show();

        Anonmousy obj2=new Anonmousy() // in this we canot create the object of
                // this class we create the object of thebelow class
            {
                public void display() {
                     System.out.println("this is display2");
                 }
                 public void  display3(){
                     System.out.println("this display3");
                 }
            };
        obj2.display();  // this anonou

        obj2.display1();
//        obj2.display3(); this not done because the instance variable is for the


    }
}
