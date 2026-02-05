import java.util.*;
public class MergeArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  arr1 size");
        int n=sc.nextInt();
        System.out.println("enter  arr2 size");
        int m=sc.nextInt();

        int arr1[]=new int[n];

        int arr2[]=new int[m];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the element");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        int k=0;
        int res[]=new int[n+m];
        for(int i=0;i<n;i++){
            res[k++]=arr1[i];
        }
        for(int i=0;i<m;i++){
            res[k++]=arr2[i];
        }
        System.out.println(Arrays.toString(res));
        int x=res.length;
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(res[j]>res[j+1]){
                    int t=res[j];
                    res[j]=res[j+1];
                    res[j+1]=t;
                }
            }
        }
        System.out.println("result");
        System.out.println(Arrays.toString(res));
    }
}
