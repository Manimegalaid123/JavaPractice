import java.util.Scanner;

public class MatrixOperations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the row");
        int n=sc.nextInt();
        System.out.println("ENter the colum");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        int arr1[][]=new int[n][m];
        int res[][]=new int[n][m];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]+arr1[i][j];
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]-arr1[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]*arr1[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=arr[i][j]/arr1[i][j];
            }
        }
        System.out.println("Addition");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" "+res[i][j]);;
            }
            System.out.println();
        }

        System.out.println("Subraction");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" "+res[i][j]);
            }
            System.out.println();
        }
        System.out.println("Multication");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" "+res[i][j]);
            }
            System.out.println();
        }
        System.out.println("Division");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" "+res[i][j]);
            }
            System.out.println();
        }
    }
}
