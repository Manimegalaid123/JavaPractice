import java.util.stream.IntStream;
class Stream{
    public static void main(String args[]){
        IntStream s=IntStream.range(1,9); // (inclusive,execulisve)
        s.forEach(System.out::println);
        IntStream s1=IntStream.rangeClosed(2,8);//(inclusive,inclusive)
        s1.forEach(System.out::println);
        IntStream s2=IntStream.of(7,3,4);
       s2.forEach(System.out::println);

//     long s2total=s2.count();
//        System.out.println(s2total);    we can use the stream only create a new stream
    }
}