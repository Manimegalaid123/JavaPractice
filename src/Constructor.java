class Tests{
    String name;
    int age;
    Tests()
    {
        name="kalai";
        age=10;
        System.out.println("constructor");
        System.out.println(name+age);    // default constructor
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
}
public class Constructor {
    public static void main(String arge[]){
         Tests obj1=new Tests();
        Tests obj2=new Tests();
        Tests obj3=new Tests(10,"kani");
        Tests obj4=new Tests(9,"mani");
        Tests obj5=new Tests(5.09090);

    }
}
