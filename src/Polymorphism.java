class Students{
    public void show(){
        System.out.println("I am the student");
    }
}
class Leader extends Students{
    public void show(){
        System.out.println("I am the class Leader");
    }
}
class PeopleLeader extends Students{
     public void show(){
        System.out.println("iam people leader");
    }
    public void show1(){
        System.out.println("this is show2 methods");
    }
}

public class Polymorphism {
    public static void main(String [] args){
//          Leader obj=new Leader();
//          obj.show();
        Students obj=new Students();
                obj.show();
                obj=new Leader();
                obj.show();

                obj=new PeopleLeader();
                obj.show();
//                obj.show1(); // in upcasting we can use only the parent class members,methods

    }
}

/*  a parent class and child name have same name methods name but static
parent class methods have static
 */