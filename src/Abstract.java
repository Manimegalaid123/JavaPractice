
//class Idea if methods is abstact the class must be Abstract
abstract class Idea{
    public abstract void show(); // abstract class declaration

    public void demo(){
        // in python the abstact can only have the abstract methods but in java
       // we may have concrete methods

        System.out.println("this demo class");
    }
}

class Project extends Idea{

    public void show(){
        System.out.println("this is from abstract class methods");

    }
    public void demo1(){
        System.out.println("this demo1");
    }
}

public class Abstract {


    public static void main(String []args){
//      Idea obj=new Idea();  for abstract class can't be create the object
//        Project obj=new Project(); // if cre
//        obj.show();
//        obj.demo();
//        obj.demo1();
        Idea obj=new Project();
        obj.show();
//        obj.demo1(); in this we canot call the subclass methods
        obj.demo();


    }
}

