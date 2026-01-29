package bag;
import bag.book.Maths;
class Student extends Maths{
    public void show(){
        System.out.println("this is prodected access modifier");

        System.out.println(book); // we can use protected in different pavkage subclass
    }
}
public class Waterbottle {
    public void show(){
        System.out.println("this Water bottle");

    }
    public static void main(){
        Student obj=new Student();
        obj.show();
    }
}
