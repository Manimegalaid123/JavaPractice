class Balance
{
    Balance()
    {
        // every constructor have methods super();
        // every class is blongs to the object class
        super();
        System.out.println("super class default constructor  ");
    }
    Balance(int n)
    {
        super();
        System.out.println("super class parameter constructor");
    }
}
class Widthdraw extends Balance
{
     Widthdraw()
     {


         super();
         System.out.println("subclass default constructor");

     };
     Widthdraw(int n)
     {
         super();
         System.out.println("subclass parameter constructor");
     }

}
public class Super {
    public static void main(String args[]){
         Widthdraw obj=new Widthdraw();

    }
}
