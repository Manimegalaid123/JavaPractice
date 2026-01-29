package Arrays;
import java.util.*;
class Subject{
   public  String name;
    Subject(String name){
        this.name=name;
    }
        }
        class Student1{
    int rollno;
        }
public class Arrayconpt {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Subject[] subname=new Subject[5];
        for(int i=0;i<subname.length;i++){
            String name=sc.nextLine();
            subname[i]=new Subject(name);
        }
        for(int i=0;i<subname.length;i++){
            System.out.println(subname[i].name);

        }
        // without constuctor

        Student1 [] students=new Student1[3];
        Student1 s1=new Student1();
        Student1 s2=new Student1();
        Student1 s3=new Student1();

            s1.rollno =sc.nextInt();
        s2.rollno =sc.nextInt();
        s3.rollno =sc.nextInt();
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        System.out.println("student details");
for(int i=0;i<students.length;i++) {
    System.out.println(students[i].rollno);

}


        }


}
