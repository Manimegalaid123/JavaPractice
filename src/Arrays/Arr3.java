package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Arr3 {
    public static void main(String[] args) {
        int arr[][][] = {
                {{1, 2}, {3, 4}}, {{5, 6}, {8, 9}, {11, 12}}, {{14, 15}, {16, 17}}
        };
        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(a));

        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;
        System.out.println(n);
        System.out.println(m);
        System.out.println(o);
        System.out.println(arr[1][0][0]);
        int arr4[][] = new int[1][];
        arr4[0] = new int[5];
        int c = 0;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = c++;
            }
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        int c1 = 100;
        int a1[][][] = new int[2][][];
        a1[0] = new int[2][3];
        a1[1] = new int[3][2];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                for (int k = 0; k < a1[i][j].length; k++) {
                    a1[i][j][k] = c1++;
                }
            }
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                for (int k = 0; k < a1[i][j].length; k++) {
                    System.out.print(a1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int x[][] = new int[5][];
        for (int i = 0; i < x.length; i++)
            x[i] = new int[i + 1];


        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
