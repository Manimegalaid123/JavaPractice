import java.util.*;
public class CountCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = sc.nextLine().toLowerCase();
            int v = 0, c = 0, s = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a'&&ch<='z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                            ch == 'o' || ch == 'u') {
                        v++;
                    } else {
                        c++;
                    }
                }
                else if (ch != ' ') {
                    s++;
                }
            }
            System.out.println("Vowels: " + v);
            System.out.println("Consonants: " + c);
            System.out.println("Special Characters: " + s);
            StringBuffer sb = new StringBuffer("Java");
            sb.append(8);
            System.out.println(sb);
            Random rand = new Random();
            int num = rand.nextInt(10);
            System.out.println(num);
            int num1 = (int)(Math.random() * 10) + 1;
            System.out.println(num1);
            Random rand1 = new Random(42);
            System.out.println(rand1.nextInt(5));
            int[] arr = new int[5];
            Arrays.fill(arr, 3, 5, 7);
            System.out.println(arr[3] + arr[4]);

            int[] source = {1, 2, 3, 4, 5};
            int[] dest = new int[5];
            System.arraycopy(source, 1, dest, 2, 2);
            System.out.println(dest[2] + dest[3]);
        }
    }


