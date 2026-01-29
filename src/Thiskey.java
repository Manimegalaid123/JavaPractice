class Demo1{
    String name;
    int age;
//    public void show(int age,Demo1 obj){
////        Demo1 obj1= new Demo1();
////
////        obj1.age=age;    it create the new object and assign the value
//        Demo1 obj1=obj;
//        obj1.age=age;
//        System.out.println(age);
//    }
    public void show1(int age){
        this.age=age;
        System.out.println("this key is refer the current object caling the methods");

    }


;}
public class Thiskey {
    public static void main(String args[]){
       Demo1 obj=new Demo1();
//
//       obj.show(10,obj);
        obj.show1(21);
        System.out.println(obj.age);

//        System.out.println(obj.age);
        Demo1 obj1=new Demo1();
        obj1.show1(45);
        System.out.println(obj1.age);
        System.out.println(obj.age);




    }
}
