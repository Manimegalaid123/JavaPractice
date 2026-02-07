public class Exc {
    public static void main(String args[]) {
        int age = 18;
        if (age >= 18) {
            try {
                throw new Exception("this ");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("this last ");

    }
}
