//import bag.*; it give error because the maths class in the book package
// * used for access the all file (class) in side the package


import bag.book.Maths;
import bag.book.*;
import bag.*;

public class Package {
    public static void main(String[] args){
        Maths obj=new Maths(); // it give error for this we have to import the package
        obj.show();
        Science obj1=new Science(); // it give error
        obj1.show();
        Waterbottle obj2=new Waterbottle(); // error because we import only the book packge classes
        obj2.show();
        Diffenbox obj3=new Diffenbox();
        obj3.show();
//        System.out.println(obj3.diffen); out side the package

    }
}
