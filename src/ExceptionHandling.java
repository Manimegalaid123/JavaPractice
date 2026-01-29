/*
compile time error - syntax,type mismatch, type error
runtime error-  program run correctly but when  a certain condition  the error is occured
logical error- program run smmothly but the output not coorect
exception handling -used to handle the runtime error and other exception condition
that distrup the flow of the program. it allow the developer to handled the unexcected event
 */
class Handle{
     int a=10;
     int b=20;
    int d;
//     int[] arr =new int[5];
//     int d=a/b;
//      it give the Zero divsion error

    // object
    //throwable
    // Exception
    //  Runtime exception - unchecked exception - we abe to hanlde are not
    //  Sql Exception ,IO exception - checked - we must able to handle it
    // do not put the exception in the 1st catch block it give an error
    // throw give used to throw the error it may be custom exception
    // throws keyword is used when the function not able to handle it

   public  void handling(){
    try{

//        System.out.println(arr[7]);
        d=a/b;
        if (d==0){
            throw new ArithmeticException(" is this default value");
        }
    }
    catch(ArithmeticException e ) {
        d=a/1;
        System.out.println(e);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("hi ");
    }catch(Exception e){
        System.out.println();
    }
       System.out.println(d);
   }
}

public class ExceptionHandling {
public static void main(String[] args){
    Handle obj=new Handle();
    obj.handling();;
}
}
