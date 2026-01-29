 /* lamda expression is only work with functional interface alone becuse i has one mthods
 lambda expression is simple and short way to write the methods
 // it work with SAM alone becuse assume you have 2 methods you
 // implement the lamba expresion you didnot whom to implement
 interface has 2 methods a , b you implemet the A obj=()->{
                                             sout for which mthod in
  in lambda expression we didnot explicty guven the methods namae


*/
 interface Interface45{
    void show(int s);
}
interface Interface55{
     int make(int a,int b);
}
public class LambadaExpression {
    public static void main(String []args){
       Interface45 obj=(int s)->{
           System.out.println(s);
       };
       obj.show(5);
       Interface55 obj1=(int a,int b)-> {
           a = b * 10;
           b = a * 10;
           return a + b;
       };

        System.out.println(obj1.make(9,3));
    }
}
