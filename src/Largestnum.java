import java.util.*;
public class Largestnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("first largest number is "+max);
        int secmax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(secmax<arr[i] && arr[i]!=max){
                secmax=arr[i];
            }else{
                secmax=-1;
            }
        }
        System.out.println("Second largest numbers is " + secmax);
    }
}
