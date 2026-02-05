/* It present  in java.util.*;
it is  used to store the hetrogenous element
the size is dynamic
default memory size is 10 ,if we try to store more than 10 element memory is expand
 so we called size is not fixed
 it maintain the insertion order
 it allows duplicate value
 Syntax :-
 List<> varname=new ArrayList<>();

 list.add(index,value) it shift value in index and add the new value
 list.set(index,value) it replace the value in the index
 */
/* Wrapper class
it is used to convert the primitive datatype into a object
byte-Byte,short-Short ,int-Integer,float-Float,boolean-Boolean,char-Character,double-Double,long-Long

 */
/*
List ->parent class
   ->ArrayList
   ->LinkedList
   ->HashMap
 */
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String args[]){
     ArrayList l=new ArrayList();
     l.add(1);
     l.add(2);
     l.add(4);
     l.add(2,10);
     l.set(1,3);

        System.out.println(l);
        ArrayList <Integer> l1=new ArrayList<>();
    }
}
