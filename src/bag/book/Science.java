package bag.book;
import bag.*;

public class Science {
     public void show(){
        System.out.println("this is science class");

    }
    public static void main(String args[]){
         Maths obj=new Maths();
        System.out.println(obj.rollno); // we can acces the default modiefir with in the same package non sub class
          Diffenbox obj1= new Diffenbox();
//        System.out.println(obj1.diffen); we cannot access because ousside package
//        System.out.println(obj.mark); we cannot acees because private access with in same class
        System.out.println(obj.book); // we can protect with same package subclass and non subclass
//        System.out.println(obj1.lunch); // we can access the different package
    }
}
