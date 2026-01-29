public class Variable {
      int num; // instance variable it has default value

      static String name;
      public void show(){
          System.out.println(num+ " :"+name);
      }
    public void add(){
        int a=10;
        int b=5;  // local variable
//        public int c=10; does not apply the access modifier
//        int d; must be initailized
        int sum=a+b;
        System.out.println(sum);

    }
    public static void main(String args[]){

//        System.out.println(a);
        Variable obj=new Variable();
        Variable obj1=new Variable();
     obj.add();
        System.out.println(obj.num);
        obj.num=10;
        obj1.num=11;

        obj1.name="hello";
        obj.name="hi";
        obj.show();
        obj1.show();



    }
}
