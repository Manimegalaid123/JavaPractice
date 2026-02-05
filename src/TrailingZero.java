import java.util.*;
public class TrailingZero {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int c=0;
        System.out.println("Enter the number of element:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr1[]=new int[n];
        System.out.println("Enter the element:");
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++){
       if (arr[i] == 0) {
           c++;
       }
   }
   int k=0;
   for(int i=0;i<n;i++){
       if(arr[i]!=0){
      arr1[k++]=arr[i];
       }
   }

      for(int i=k;i<c;i++){
          arr1[i]=0;
      }
        System.out.println(Arrays.toString(arr1));
    }
}
