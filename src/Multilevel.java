
class  Student{
    public  void student(){
        System.out.println("this is student");
    }
}
class ClassLeader extends Student{
    public void show(){
        System.out.println("this is classleader");
    }
}
class Abi extends ClassLeader {
    public void show1(){
        System.out.println("this is abi");
    }
}
public class Multilevel {
    public static void main(String args[]){
        Abi obj=new Abi();
        obj.show1();
        obj.show();
        obj.student();
    }
}

