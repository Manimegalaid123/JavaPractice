class Tests{
    String name;
    int age;
    Tests()
    {
        name="kalai";
        age=10;
        System.out.println("constructor");// because there is parameter constructor
        System.out.println(name+age);    // zero parameter
 // comlier can create one default construct with class name when no constructor present inside the class
        // if there is no paramter constructor means its default constructor
        // constructor is used to load non static member into the object
        // constructor does not have any return type
    }

    Tests(int age,String name)
    {
        this.name=name;
        this.age=age;
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println("parameter constructor");   // parameter constructor
    }
    Tests(double age)
    {
        this.age= (int)age;
        System.out.println(this.age+" datatype changed");
    }
    Tests(int a,double b){
        System.out.println(a+b+" this I->D");
    }
    Tests(double a,double b){
        System.out.println(a+b+4+" D->D");
    }
    Tests(double a ,int b){
        System.out.println(a+b+7+" this D->I");
    }
}
public class Constructor {
    public static void main(String arge[]){
         Tests obj1=new Tests();
        Tests obj2=new Tests();
        Tests obj3=new Tests(10,"kani");
        Tests obj4=new Tests(9,"mani");
        Tests obj5=new Tests(5.9,9);

    }
}
