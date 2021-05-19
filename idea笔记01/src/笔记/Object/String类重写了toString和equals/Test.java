package 笔记.Object.String类重写了toString和equals;

public class Test {
    public static void main(String[] args) {

        // 大部分情况下，采用这样的方式创建字符串对象
        String s1 = "hello";
        String s2 = "abc";

        // 实际上String也是一个类。不属于基本数据类型。
        // 既然String是一个类，那么一定存在构造方法。
        String s3 = new String("Test1");
        String s4 = new String("Test1");
        // new两次，两个对象内存地址，s3保存的内存地址和s4保存的内存地址不同。
        // == 判断的是内存地址。不是内容。
        System.out.println(s3 == s4); // false

        // 比较两个字符串能不能使用双等号？
        // 不能，必须调用equals方法。
        // String类已经重写equals方法了。
        System.out.println(s3.equals(s4));  // true

        // String类有没有重写toString方法呢？
        String x = new String("动力节点");
        // 如果String没有重写toString()方法，输出结果：java.lang.String@十六进制的地址
        // 经过测试：String类已经重写了toString()方法。
        System.out.println(x.toString());   // 动力节点
        System.out.println(x);  // 动力节点
    }
}
