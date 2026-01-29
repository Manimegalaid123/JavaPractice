//it blue print of the class
// it must have the abstract methods if not mention it is implicity
// if you implement the interface in the class the class must override the abstract methods
//if not it must be a in abstract class
//it have final static variable because we cannot create the object
// class-class ,interface to interface



interface Dosa1
    {
    int count=10;
    void things(); //implicitily  public abstract
    void process();
    }
interface MasalaDosa
{
    void masala();
    void things();

}
interface KariDosa extends MasalaDosa
{
    void chicken();
    void egg();
}
//  Make implements Dosa1,MalasaDosa,KariDosa
 abstract class Make implements Dosa1,KariDosa
{ // it multiple interface
    public void things()
    {
        System.out.println("flour,water,salt we need");
    }

    public void process()
    {
        System.out.println("this is the processs");
    }

    public void masala()
    {
        System.out.println("this is masala");  // this is from another interface  we need object to call
    }

    public void chicken()
    {
        System.out.println("this is chicken...");
    }
}
class DosaReady extends Make
{
        public void egg()
        {
            System.out.println("Dosa ready");


}
}

public class Interface {
    public static void main(String[] args) {
//        Dosa1 obj = new Make();
//        obj. things();
//        obj.process();
//        MasalaDosa obj1=new Make();
//        obj1.masala(); // this is from anthor interfce we need object
//        KariDosa obj2=new Make();
//        obj2.chicken();; if we canot implement all the methods we make th class abstract

        DosaReady obj=new DosaReady();
        obj. things();
        obj.process();
        obj.masala();
        obj.chicken();
        obj.egg();
        System.out.println(Dosa1.count);
    }
}
