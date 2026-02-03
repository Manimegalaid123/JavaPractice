package Arrays;
import java.util.Scanner;
import java.util.Arrays;
class Student{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class Task {
    public static void main(String[] args) {
  int a[]={1,2,3};
        System.out.println(a.equals(0));

//        Student s2=new Student();
//        Student s3=new Student();
//        Student s4=new Student();
//        Student s5=new Student();
//        Student cseb[]=new Student[5];
//        for(int i=0;i<cseb.length;i++){
//            Student s=new Student(1,"kalai");
//            cseb
//        }
//
//        for(int i=0;i,cseb.length;i++){
//
//        }
//        s1.rollno=1;
//        s2.rollno=2;
//        s3.rollno=3;
//        s4.rollno=4;
//        s5.rollno=5;
//        s1.name=data[0];
//        s2.name=data[1];
//        s3.name=data[2];
//        s4.name=data[3];
//        s5.name=data[4];
//
//        cseb[0]=s1;
//        cseb[1]=s2;
//        cseb[2]=s3;
//        cseb[3]=s4;
//        cseb[4]=s5;
//        for(int i=0;i<cseb.length;i++) {
//            System.out.println("Student rollno "+ cseb[i].rollno+ " and name "+cseb[i].name);
//        }

        // corrected code
        String[] data = {"kalai", "kani", "viji", "subi", "vani"};
        Student[] cseb = new Student[data.length];

        for (int i = 0; i < cseb.length; i++) {
            cseb[i] = new Student(i + 1, data[i]);

        }
        for (int i = 0; i < cseb.length; i++) {
            System.out.println("rollno " + cseb[i].rollno + "and name " + cseb[i].name);
        }


        String str1 = "  HI  HEllo . ";
        String words = str1.trim();
        System.out.println(words);
        System.out.println(str1);
    }

}
