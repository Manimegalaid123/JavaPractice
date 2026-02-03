
class Animal{
    public  void animal(){
        System.out.println("this is animal");
    }
}
class Dog extends Animal{
    public void dog(){
        System.out.println("this is dog");
    }
}

public class Single {
    public static void main(String args[]){
         Dog obj=new Dog();
         obj.dog();
         obj.animal();
    }
}
