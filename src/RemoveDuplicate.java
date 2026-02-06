
import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        System.out.println("Enter the element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       for(int num:arr){
           set.add(num);

        }
        System.out.println(set);
    }
}
