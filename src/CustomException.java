class MyException extends Exception{
    public MyException(String a){
        super(a);
    }
}

class Exec{
     int a[]=new int[5];
     public void check(){
         int i=9;
         try {
             if (i > a.length) {
                 throw new MyException("this my custom exception");
             }
         }catch(MyException e){

             System.out.println(e);
         }
     }

}


public class CustomException {
    public static void main(String args[]){
 Exec obj=new Exec();
 obj.check();
    }
}
