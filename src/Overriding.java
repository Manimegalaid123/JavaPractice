
/* if parent class and child class have the same method which is non static

 */
//class A{
//     void show(){
//         System.out.println("this is A");
//     }
//     void display(){
//         System.out.println("display");
//     }
//}
//class B extends A{
//    void show(){
//        System.out.println("this is B");
//    }
//}

class A{

    public int show(int a,int b){
        return a+b;
    }
}
class B extends A
{
     public int show(int a,int b){

        return a+b+9;
    }
}
public class Overriding
{
    public static void main(String args[]){
         B obj= new B();
       int res= obj.show(7,0);
        System.out.println(res);
    }
}

// it based on the object  type