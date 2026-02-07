import java.util.Random;

public class MathAndRandom {
    public static void main(String args[]){
        Random r=new Random();
        System.out.println(r.nextInt(10));
        System.out.println(r.nextBoolean());
        System.out.println(r.nextFloat());
        System.out.println(Math.max(10,23));
        System.out.println(Math.min(-1,2));
    }
}
