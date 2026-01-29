// it is nothing but it only have the one abstract methods
// lamba function is associate with SAM it is introduce in the java 8
@FunctionalInterface
interface Testable{
    int v=10; // act as fina variable
    void make();
}
//interface Marakable extends Testable{
//    void make();
//    void show();
//} we can have extends

public class Functioninterface {
     public static void main(String []args){
         System.out.println(Testable.v);
//         Testable.v=20 this will create error
         Testable obj=new Testable() {
             public void make(){
                 System.out.println("functional interface");
             }
         };
         obj.make();
     }
}
