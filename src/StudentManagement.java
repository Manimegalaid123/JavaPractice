import java.sql.SQLOutput;
import java.util.*;

abstract class Student{
    String studentid;
    String name;
    String dept;
    boolean isUndergraduate;
    HashSet<Course>list=new HashSet<>();
    HashMap<String,Integer> entrolledlist=new HashMap<>();
    public Student(String studentid,String name,String dept,boolean isUndergraduate){
        this.studentid=studentid;
        this.name=name;
        this.dept=dept;
        this.isUndergraduate=isUndergraduate;

    }
    public void addcourse(Course ds){
        list.add(ds);
        System.out.println("course added successfully");


    }

    public void showAvailablecourse() {
        for (Course c : list) {
            System.out.println(c.courseName + ": " + c.credit + "");
        }
    }
    public void entrollecourse(String ecourse) {
        int credit = 0;
        boolean found = false;
        if (isUndergraduate) {
            for (Course c : list) {
                if (ecourse.equalsIgnoreCase(c.courseName)) {
                    if (c.credit <= 24) {
                        entrolledlist.put(c.courseName, c.credit);
                        System.out.println("course entrolled successfully");
                        credit = credit + c.credit;
                        found = true;

                    } else {
                        System.out.println("your credit exceed 24");
                    }
                    break;
                }
            }
        }
                if (!found) {
                    System.out.println("course is not avaliable");
                }


    }


        public void viewEntrolledcourse(){
            if(!entrolledlist.isEmpty()){
                for(String key:entrolledlist.keySet()){
                    System.out.println(key+" : "+entrolledlist.get(key));
                }
            }else{
                System.out.println("The list empty");
            }
        }
        public String toString(){
            return "StudentID : "+this.studentid+" student name : "+this.name+"student dept : "+this.dept;
        }

    }
    class Undergraduate extends Student{
        int yearOfStudy;
        public Undergraduate(String studentid,String name,String dept,int yearOfStudy,boolean isUndergraduate){
            super(studentid,name,dept,isUndergraduate);
            this.yearOfStudy=yearOfStudy;
        }
        public String toString(){

            return super.toString()+ "Year of Study : "+yearOfStudy;
        }
    }

    class Graduate extends Student{
        String researchTopic;
        public Graduate(String studentid,String name,String dept,String researchTopic,boolean isUndergraduate){
            super(studentid,name,dept,isUndergraduate);
            this.researchTopic=researchTopic;
        }
        public String toString(){

            return super.toString()+"researchTopic : "+researchTopic;
        }
    }

    class Course{
        String courseName;
        int credit;
        boolean isAdvancecourse;
        public Course(String courseName,int credit,boolean isAdvancecourse){
            this.courseName=courseName;
            this.credit=credit;
            this.isAdvancecourse=isAdvancecourse;

        }
    }
    public class StudentManagement{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Student student=null;
            while(true) {
                System.out.println("1.Create Student");
                System.out.println("2.Add course");
                System.out.println("3.View Available course");
                System.out.println("4.entroll Course");
                System.out.println("5.view Entolled course");
                System.out.println("0.exit");
                System.out.println("Enter the option");
                int choice=sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                    System.out.println("Enter the student Id");
                    String studentid = sc.nextLine();
                    System.out.println("Enter the Student Name");
                    String name = sc.nextLine();
                    System.out.println("Enter the departement");
                    String dept = sc.nextLine();
                    System.out.println("Enter True if UG ");
                    boolean isUndergraduate = sc.nextBoolean();
                    sc.nextLine();

                    if (isUndergraduate) {
                        System.out.println("Enter year of study");
                        int yearOfStudy = sc.nextInt();
                        sc.nextLine();
                        student = new Undergraduate(studentid, name, dept, yearOfStudy, isUndergraduate);
                        System.out.println(student.toString());
                    }else{
                        System.out.println("Enter research topic");
                        String researchTopic = sc.nextLine();
                        student = new Graduate(studentid, name, dept, researchTopic, isUndergraduate);
                        System.out.println(student.toString());
                    }
                    break;
                    case 2:
                    System.out.println("Enter the coursename");
                    String coursename = sc.nextLine();
                    System.out.println("enter the credit of the course");
                    int credit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("this advance course or not");
                    boolean isAdvancecourse = sc.nextBoolean();
                    Course ds = new Course(coursename, credit, isAdvancecourse);
                    student.addcourse(ds);
                    break;
                    case 3:
                        System.out.println("==Available course");
                    student.showAvailablecourse();
                    break;
                    case 4:
                    System.out.println("Enter the course for enrolling");
                    String ecourse = sc.nextLine();

                    student.entrollecourse(ecourse);
                    break;
                    case 5:
                        System.out.println("Entrolled course");
                    student.viewEntrolledcourse();
                    break;
                    case 0:
                        System.out.println("exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid option");
                        break;
                }
            }
        }
    }