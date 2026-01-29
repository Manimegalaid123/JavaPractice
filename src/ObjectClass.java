class X{
 public String toString(){
     return "this A class tostring no object class";
 }
}


public class ObjectClass {
     public static void main(String[] args){
         X obj1=new X();
         X obj2=new X();

         System.out.println(obj1.toString()); // it implicitly call the Tostring() mothods
         // it return the class name and hashcode hexadecimal value .hashcode genrated when obj created
         System.out.println(obj1);
         System.out.println(obj2); // it inherit the object class toString method
         System.out.println(obj1==obj2);
         System.out.println(obj1.equals(obj2));


     }
}
