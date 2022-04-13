

public class Test3 {
    public static void main(String[] args) {
        Person per1 = new Person();
        per1.name = "hello";
        per1.age = 18;
        per1.sex = "male";
        per1.country = "Japen";
        per1.show();
    }
}

class Person{
    //成员变量或者说实例变量必须通过该类的对象来访问
    String name;
    int age;
    String sex;
    String country;
    //成员方法，也是不许通过对象来访问
    void show(){
        System.out.println("name = " + name + ", age = " + age + ", country = " + country);
    }

}