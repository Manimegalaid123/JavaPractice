


class  Vechical{
    public  void vechical(){
        System.out.println("this is vechical");
    }
}
class Car extends Vechical{
    public void show(){
        System.out.println("this is car");
    }
}
class Bike extends Vechical {
    public void show1(){
        System.out.println("this is bike");
    }
}

public class Hierarchical {
        public static void main(String args[]){
            Bike obj=new Bike();
            obj.show1();
            obj.vechical();
            Car obj1=new Car();
            obj1.show();
            obj1.vechical();

        }
}
