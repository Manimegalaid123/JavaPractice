
class Methods1{
    public static void bike(){
        System.out.println("this is super class ");
    }

}
class Methods2 extends Methods1{
    public static void bike(){
        System.out.println("this is child classs");
    }
}
public class Method_shadowing {
    public static void main(String args[]){
        Methods1 obj=new Methods2();
        Methods2 obj2=(Methods2)obj;
        obj2.bike();
        obj.bike();
    }
}


/*parent claass and child have same variable name but doenot start with static
it based on the referemce type
 */