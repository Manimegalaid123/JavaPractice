
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AccessdingArray {
    public static void main(String args[]){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the element");
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
        int x=arr.length;
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
