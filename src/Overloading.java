class Comp{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(int a,double b){
        return a+b;
    }
    public double add(double a,int b){
        return a;
    }
}
public class Overloading {
    public static void main(String a[]){
        Comp obj=new Comp();
         // methods over loading
//        System.out.println(obj.add(3,8));  // this is type promotion
    }
}
