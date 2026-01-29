// it is meta data if provide the addition info about the program
// it6 provide the supplement to the complie
//it does not change the program execution
//@FunctionalInterface
// if i put annotation give give info about the program
// the annotation associate with the class ,methods,variable
@FunctionalInterface
interface Interface1{
    void make();
//    void show1();
}
class Class1{
   public void show(){
        System.out.println("this additional info from the meta data");
    }
}
class Class2 extends Class1{
    @Override
    public void show(){
        System.out.println("annotation provide the what we schedule  vs what we do");
    }
    public void show2(){
        System.out.println("this is extra");
    }
}

public class Annotation {
    public static void main(String []args){
        Class2 obj=new Class2();
        obj.show2();
    }
}
