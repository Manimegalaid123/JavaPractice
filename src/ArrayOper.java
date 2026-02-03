import java.util.*;
public class ArrayOper {
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        while(true){

            Scanner sc=new Scanner(System.in);

            System.out.println("1.Insert\n2.Delete\n3.serach\n4.reverse\n5.exits ");
            System.out.println("Enter the choice");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("enter the position to insert");
                    int pos=sc.nextInt();
                    System.out.println("enter the element");
                    int val=sc.nextInt();
                    if(pos<1 || pos>list.size()+1){
                        System.out.println("Invalid position");

                    }else {
                        list.add(pos - 1, val);
                        System.out.println("successfully");
                    }
                    break;
                case 2:
                    System.out.println("enter the pos");
                    int posi=sc.nextInt();
                     if(posi<1 || posi>list.size()){
                         System.out.println("invlid");
                     }else{
                         list.remove(posi-1);
                     }
                     break;
                case 3:
                    System.out.println("enter the posi");
                    int vali=sc.nextInt();
                    int k=list.indexOf(vali);
                    if(k!=-1){
                        System.out.println("element posi"+(k+1));


                    }else{
                        System.out.println("element not found");
                    }
                    break;
                case 4:
                    Collections.reverse(list);
                    System.out.println(list);
                    break;
                case 6:
                    System.out.println(list);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invlid operation");

            }

        }
    }
}
