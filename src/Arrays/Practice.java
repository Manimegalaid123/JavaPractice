package Arrays;
import java.util.Arrays;
class Min{
    public int min(int a[]){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
    return min;

    }
}

public class Practice {
    public static void main(String[] args) {
    int arr10[][]=new int[][]{
            {1,2},{24,4},{4,5}
        };

        System.out.println(Arrays.toString(arr10));
        System.out.println(Arrays.deepToString(arr10));
        System.out.println(arr10[0]);
        String arr2[]=new String[4];
        Arrays.fill(arr2,"not yet ");
        System.out.println(Arrays.toString(arr2));
        int a[]=new int[]{65,112,125,120,209,100};

        System.out.println(Arrays.toString(a));

        Min obj1=new Min();

        System.out.println("minimun element "+ obj1.min(a));
        for(int i=0;i<arr10.length;i++) {
            for (int j = 0; j < arr10[i].length; j++) {
                System.out.print(arr10[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(arr10));
    }
}
