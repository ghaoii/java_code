

//主类
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "abcd";
        person1.age = 18;
        person1.sex = "male";
        person1.print();
        Person person2 = new Person();
        person2.print();
        //System.out.println(person2.name.length());//调用了一个值为null的引用
    }
}

//自建类
class Person{
    String name;
    int age;
    String sex;

    void eat(String food){
        System.out.println(name + "正在吃" + food);
    }

    void print(){
        System.out.println("姓名为：" + name + "，年龄为：" + age + "，性别为：" + sex);
    }

}