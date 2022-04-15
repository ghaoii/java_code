import com.oracle.webservices.internal.impl.internalspi.encoding.StreamDecoder;


public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("王五");
    }
}


class Animal{
    private String name = "张三";
    static final int age = 10;

     static {
        System.out.println("3.Animal的静态代码块");
        System.out.println(age);
    }
    {
        System.out.println("2.Animal的构造块");
        System.out.println(name);
        name = "李四";
        System.out.println(name);
    }
    public Animal(){
        System.out.println("1.Animal的无参构造");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("1.Animal的有参构造");
        System.out.println(this.name);
    }
}



//class Student{
//    private String name;
//    private int age;
//    private String sex;
//
//    public void whoAmI(){
//        System.out.println(this);
//    }
//}



//public class Test {
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        Person per2 = new Person("test1");
//        Person per3 = new Person("test2", 18);
//        }
//    }


//class Person{
//    String name;
//    int age;
//
//    public Person(){
//        System.out.println("Person的无参构造");
//    }
//    public Person(String name){
//        this.name = name;//调用对象的成员变量name将形参的值传给name
//        System.out.println("name = " + name);
//        System.out.println("Person的一个参数的有参构造");
//    }
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("name = " + name + ", age = " + age);
//        System.out.println("Person的两个参数的有参构造");
//    }
//
//}


//homework3
//public class Test{
//    static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt = " + cnt);
//    }
//    static{
//        cnt /=3;
//    };
//}

//homework2
//public class Test{
//
//    private int count;
//
//    public static void main(String[] args) {
//
//        Test test=new Test(88);
//
//        System.out.println(test.count);
//
//    }
//
//    Test(int a) {
//
//        count=a;
//
//    }
//
//}