//the constructor is alwys private

enum Food{

    CHICKEN(240),MUTTON(700),FISH(200),EGG(70),CRAP();
    int price;
    Food(){
        System.out.println("hi");

    }
    Food(int price){
        this.price=price;

        System.out.println("hi");

    }
    public int display(){
        return this.price;
    }

}

public class Enum {
     public static void main(String[] args){
         Food f=Food.FISH;
         Food f2=Food.MUTTON;
         System.out.println(f);
         System.out.println(f.getClass());
         System.out.println(f.ordinal());
         System.out.println(f.price);
         Food f1[]=Food.values();
         for (Food f3:f1){
             System.out.println(f3+" : "+f3.ordinal());
         }
         if(Food.MUTTON==f){
             System.out.println("i donot like this");
         }else{
             System.out.println("i like other food");
         }

         switch (f){
             case FISH:
                 System.out.println("this is fish...");
                 break;
             case MUTTON:
                 System.out.println("this mutton...");
                 break;
             case EGG:
                 System.out.println("this EGG...");
                 break;
             default:
                 System.out.println("this is chicken...");
                 System.out.println(f.display());

         }
     }
}
