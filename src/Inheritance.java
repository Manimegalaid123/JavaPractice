class Animal{
      void show(){
          System.out.println("Animal ");
      }
}
class Dog extends Animal{

     void show1(){
         System.out.println("Dog ");
     }
}
class BabyDog extends Dog{
    void show3(){
        System.out.println("baby dog");
    }
}
class Cat extends Animal{
    void show4(){
        System.out.println("this cat class");
    }
}
public class Inheritance {
    public static void main(String []args){
//         Dog obj=new Dog();
//         Animal obj1=new Animal();
//         obj.show();
//         obj.show1();        single inheritance
//         obj1.show();
        BabyDog obj1=new BabyDog();
        Animal obj2=new Cat();
        obj1.show3();
        obj1.show();
        obj1.show1();
        Cat obj3=(Cat)obj2;
        obj3.show4();


    }
}
