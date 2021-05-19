package 笔记.final关键字.final修饰的引用草图示例;

public class Person {
    int age;

    public Person(){
    }

    public Person(int age) {
            this.age = age;
        }



    public static void main(String[] args) {
        final Person p = new Person(18);
        //p = new Person(30); 错误
        //p = new Person(40); 错误
        p.age = 19;
        System.out.println(p.age);
        /*
        虽然final的引用指向对象A后，不能再重新指向对象B。
        但是对象A内部的数据可以被修改。
         */
    }

}
