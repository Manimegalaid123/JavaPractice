package Arrays;
import java.util.*;
import java.util.Arrays;

public class Darray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[2][3];
        int [][] arr2=new int[][]{{1,2,3,},{1,2,3}};
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {

                arr[i][j] = sc.nextInt();

            }
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
     // for 2d   System.out.println(Arrays.deepToString(arr2));
        int arr1[]=new int[]{1,2,3};
//       for 1d
       System.out.println(Arrays.toString(arr1));
        System.out.println("lenth"+arr.length);


        }
        }


