import java.util.*;
public class Mobiledata {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Plan Type ( P for prepaid or O for postPaid)");
      String plan=sc.nextLine();
      System.out.println("data Used : ");
      double data=sc.nextDouble();
      System.out.println("Base Bill : ");
      double bill=sc.nextDouble();
      double total=0;
      double extra=0;
        System.out.println("Plan Type :"+plan);
        System.out.println("data used : "+data);
        System.out.println("Base Bill: "+bill);

      if(plan.toUpperCase() == "P"){
          if(data <=1.5){
              extra=0;
              total =bill+0;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);

          }else if(data>1.5 && data<=3){
              extra=50;
              total=bill+extra;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);
          }else{
              extra=100;
              total=bill+extra;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);
          }

      }else{
          if(data<=5){
              extra=0;
              total=bill+extra;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);
          }else if(data >5 &&  data<=10){
              extra=150;
              total=bill+extra;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);
          }else{
              extra=300;
              total=bill+extra;
              System.out.println("Extra bill : "+extra);
              System.out.println("Total bill : "+total);
          }
      }
    }
}
