// if you implement the class only for inherit the methos or override the methods in the parent class you
// go to the inner class whicch create the reference of parent and object of the anonomus class
abstract class Dosa{
    public abstract void making();
    public void Vada(){
        System.out.println("this vada");
    }
}


public class AbstractAndAnonmous {
    public static void main(String[] args){
        // we canot create abstract class object but we create referecenece
        Dosa obj=new Dosa(){
            public void making(){
                System.out.println("Dosa is ready");
            }
        };
        obj.making(); // it only for override the methods the inner class doesnot have any methods
        obj.Vada();
    }
}


