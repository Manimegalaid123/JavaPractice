import java.util.*;


public class ReverseList {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());

        }
        System.out.println("Original List");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i<list.size()-1){
                System.out.print(" --> ");
            }
        }
        System.out.println();
        System.out.println("Reverse List");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
            if(i>0){
                System.out.print(" --> ");
            }
        }


    }
}
