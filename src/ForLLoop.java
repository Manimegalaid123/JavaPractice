public class ForLLoop {
    public static void main(String args[]){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int x=1;
        int y=2;
        if(x>y)
            System.out.println("1");
        else if((x<y*2)  && (x++==1))
            System.out.println("2");
        else
            System.out.println("3");
            System.out.println(x);
    }
}
