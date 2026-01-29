import java.util.Scanner;

public class StudentsMarks {

        public static void main(String args[]){
//            String name="mani";
//            int rollno=121;
//            float m1=98.5f;
//            float m2=97.3f;
//            float m3=100.0f;
//            int total=(int)(m1+m2+m3);
//            float avg= (float)(total/3);
//            System.out.println(rollno+" "+name+" "+avg+" ");
            Scanner sc=new Scanner(System.in);
            System.out.println("id");
            int empid=sc.nextInt();
            sc.nextLine();
            System.out.println("name");
            String name=sc.nextLine();

            System.out.println("bSalary");
            double bSalary=sc.nextDouble();
            System.out.println("HRaPEr");
            float hraPer=sc.nextFloat();
            System.out.println("taxPer");
            float taxPer=sc.nextFloat();

            double hraAmount=bSalary*hraPer/100;

            double grossSalary=bSalary+hraAmount;
            double taxAmount=grossSalary*taxPer/100;
            int net=(int) (grossSalary-taxAmount);
            System.out.println("net"+net);


    }

}
