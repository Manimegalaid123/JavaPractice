import java.util.*;
public class TodoList {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> list= new HashMap<>();
        while(true){
            System.out.println("====ToDo App====");
            System.out.println("1.add task");
            System.out.println("2.view Task");
            System.out.println("3.delete task");
            System.out.println("4 mark as complete");
            System.out.print("Enter the choice : ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("enter your title: ");
                    String title=sc.nextLine();
                    System.out.print("Enter the description: ");
                    String des=sc.nextLine();
                    list.put(title.toLowerCase(),des);
                    System.out.println("task added successfully!");
                    break;
                case 2:
                    if(list.isEmpty()){
                        System.out.println("the todo is empty");
                    }else{
                        for(String s:list.keySet()){
                            System.out.println(s+" "+list.get(s));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the title to delete ");
                    String deltitle=sc.nextLine();
                    if(list.containsKey(deltitle.toLowerCase())){
                        list.remove(deltitle);
                        System.out.println("task deleted Successfully");

                    }else{
                        System.out.println("No task with this title");
                    }
                    break;
                case 5:
                   System.exit(0);
                   break;

            }
        }
    }
}
