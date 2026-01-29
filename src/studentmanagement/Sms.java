package studentmanagement;
import java.util.*;


abstract class Student{
    String studentid;
    String dept;
    int credit;
    String user;
    String name;
    public Student(String user,String studentid,String dept,int credit,String name){
        this.user=user;
        this.studentid=studentid;
        this.credit=credit;
        this.dept=dept;

    }
    public void showUser(){
        System.out.println("the user is : "+this.user);
    }
    public abstract void showdetails(String studentid,String dept,int credit ,String name);

}
class Undergraduate extends Student{
    int year;
    public HashMap<String,Integer> appliedcourse=new HashMap<>();
    public Undergraduate(String user,int year,String studentid,String dept,int credit,String name){
        super(user,studentid,dept,credit,name);
        this.year=year; // year of study
    }
    public void showdetails(String studentid,String dept,int credit ,String name){
        System.out.println("Student ID :"+this.studentid);
        System.out.println("Student Name :"+this.name);
        System.out.println("Student department :"+this.dept);
        System.out.println("total credit :"+this.credit);
        System.out.println("The study of year"+this.year);

    }
    public void enrollcourse(String ecourse){
       boolean found=false;

            for(String key:Course.obj2.list.keySet()) {

                if (ecourse.equalsIgnoreCase(key)) {
                    if (this.credit + Course.obj2.list.get(key) <= 24) {
                        appliedcourse.put(key, Course.obj2.list.get(key));
                        System.out.println("course entrolled");

                        this.credit = this.credit + Course.obj2.list.get(key);
                        System.out.println(this.credit);
                        found = true;
                        break;
                    } else {
                        System.out.println("your credit exceed 24");

                    }
                }
            }

                if(!found){
                    System.out.println("course not Available");
                }




    }
    public void viewEnrolled(){
        if(appliedcourse.isEmpty()){
            System.out.println("the list is Empty");
        }
        else{
            for(String key:appliedcourse.keySet())
                System.out.println(key+" : "+appliedcourse.get(key));
        }
    }


}
class Graduate extends Student{
    public HashSet<String> advancecourse=new HashSet<>();
    public HashMap<String ,Integer> gappliedcourse=new HashMap<>();
    String respaper; //research topic
    public Graduate(String user,String respaper,String studentid,String dept,int credit,String name){
        super(user,studentid,dept,credit,name);
        this.respaper=respaper;
    }
    public void showdetails(String studentid,String dept,int credit,String name){
        System.out.println("Student ID :"+this.studentid);
        System.out.println("Student department :"+this.name);
        System.out.println("Student department :"+this.dept);
        System.out.println("total credit :"+this.credit);
        System.out.println("total credit :"+this.respaper);
    }
    public void advancecourses(String acourse){
        advancecourse.add(acourse);
    }

    public void enrollcourse(String ecourse){
        boolean found=false;
      if(!advancecourse.isEmpty()){
         for(String key:Course.obj2.list.keySet()) {
             if (ecourse.equalsIgnoreCase(key)) {
                 gappliedcourse.put(key, Course.obj2.list.get(key));
                 System.out.println("course enrolled");
                 found = true;
                 break;
             }
         }
            if(!found) {
                 System.out.println("course is not available");

             }

      }else{
          System.out.println("you must complete atleast one advance course");
      }
    }
    public void viewEnrolled(){
        if(gappliedcourse.isEmpty()) {
            System.out.println("the list is empty");
        }else{
            for(String key:gappliedcourse.keySet())
            System.out.println(key+" : "+gappliedcourse.get(key));
        }
    }

}
class Course{
    public static Course obj2=new Course();
    public HashMap<String,Integer> list=new HashMap<>();

    public void addcourse(String course,int credits){
        list.put(course,credits);
        System.out.println("course added successfully");
    }
    public void viewcourse(){
        if(list.isEmpty()){
            System.out.println("the course list is empty");
        }else {
            for (String key : list.keySet()) {
                System.out.println(key + ":" + list.get(key));
            }
        }



    }
}
public class Sms {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Undergraduate or graduate");
        String user=sc.nextLine();

        System.out.println("Enter the your id");
        String studentid=sc.nextLine();
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the  department");
        String dept=sc.nextLine();
        System.out.println("Enter the credit");
        int credit=sc.nextInt();
        System.out.println("enter the study of year");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the reacherpaper");
        String respaper=sc.nextLine();
        System.out.println("enter already completed course");
        String acourse=sc.nextLine();


        Undergraduate obj=new Undergraduate(user,year, studentid,dept,credit,name);
        obj.showUser();
        Graduate gobj=new Graduate(user,respaper,studentid,dept,credit,name);

        gobj.advancecourses(acourse);



        while(true){
            System.out.println("1.Undergraduate details");
            System.out.println("2.Graduate");
            System.out.println("3.Add courses");
            System.out.println("4.View Available course");
            System.out.println("5.Enroll Course");
            System.out.println("6.view Entrolled course");
            System.out.println("enter the option");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:

                    obj.showdetails(studentid,dept,credit,name);
                    break;
                case 2:

                    gobj.showdetails(studentid,dept,credit,name);
                    break;

                case 3:
                    System.out.println("Enter the course to add");
                    String course=sc.nextLine();
                    System.out.println("enter  credit");
                    int credits=sc.nextInt();

                    Course.obj2.addcourse(course,credits);
                    break;
                case 4:
                    System.out.println("===Available course===");
                    Course.obj2.viewcourse();
                    break;
                case 5:
                    System.out.println("Entroll course");
                    String ecourse=sc.nextLine();
                    if(user.equalsIgnoreCase("Undergraduate")) {
                        obj.enrollcourse(ecourse);
                    }
                    else{
                        gobj.enrollcourse(ecourse);
                    }
                    break;
                case 6:
                    System.out.println("enrolled course");
                    if(user.equalsIgnoreCase("Undergraduate")) {
                        obj.viewEnrolled();
                    }
                    else{
                        gobj.viewEnrolled();
                    }
                    break;
                case 7:

                default :
                    System.out.println("invalid");




            }
        }
    }
}
