import java.util.Arrays;
public class ArrConcept {
    public static void main(String args[]){
    // 1 D array
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
        for(int num:a){
            System.out.print(num+" ");
        }
        // 2 D array
        System.out.println("2 D ARRAY");
        int ar[][]=new int[3][2];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                ar[i][j]=i+1;
            }
        }
        for(int n[]:ar){
            for(int m:n){
                System.out.print(m+"  ");
            }
            System.out.println();
        }
        // 2 D jagged Array
        System.out.println("2 D Jagged Array");
        int arr1[][]=new int [3][];
         arr1[0]=new int[2];
         arr1[1]=new int[3];
         arr1[2]=new int[4];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=i+1;
            }
        }
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[i].length;j++){
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
    }
    // 3 Array
        System.out.println("3 D Array");
    int arr[][][]=new int[][][]{
            {{1,2,3},{4,5,6}},{{ 7,8,9},{10,11,12}}, {{1,2,3},{1,2,3}
            }};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0][1].length);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            for(int k=0;k<arr[i][j].length;k++){
                System.out.print(arr[i][j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
int arr2[][][]=new int[3][][];
    arr2[0]=new int[2][1];
    arr2[1]=new int[3][2];
    arr2[2]=new int[2][3];
    for(int i=0;i<arr2.length;i++){
        for(int j=0;j<arr2[i].length;j++){
            for(int k=0;k<arr2[i][j].length;j++){
                arr2[i][j][k]=i+1;
            }
        }
    }
        System.out.println(Arrays.deepToString(arr2));

    }
}
