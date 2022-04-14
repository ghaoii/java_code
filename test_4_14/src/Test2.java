/**
 *
 */

public class Test2 {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        Animal dog2 = new Animal("qiqi");
        Animal dog3 = new Animal("qiuqiu", 3);
    }

}

class Animal{
    String name;
    int age;
    static String kind;

    public Animal(){
        System.out.println("调用了构造方法");
    }

    public Animal(String name){
        this();
        this.name = name;
    }

    public Animal(String name, int age){
        this(name);
        this.age = age;
    }
}
