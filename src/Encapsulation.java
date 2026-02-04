/* modifier returntype getName(){
}
 modifier returnType setName(){
this.name="value"
        }*/
class Demo{
//    private int rollno=10;
//    private String name="kalai";
private int rollno;
    private String name;
    public void getRollno(){
        System.out.println(rollno);
    }
    public void getName(){
        System.out.println(name);
    }
    public  void setRollno(int roll){
//         rollno=rollno;
           rollno=roll;
    }
    public void setName(String n){
        name=n;
    }
}
public class Encapsulation {
    public static void main(String args[]){
           Demo obj=new Demo();
//        System.out.println(obj.name);  name has private access in Demo
        obj.setRollno(21);
         obj.getRollno(); // we can access through the methods alone
        obj.setName("kalai");
        obj.getName();
    }
}
