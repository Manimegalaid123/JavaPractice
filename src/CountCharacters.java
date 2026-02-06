import java.util.Scanner;
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
        }
    }


