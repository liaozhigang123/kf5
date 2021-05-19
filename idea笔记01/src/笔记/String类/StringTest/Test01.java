package 笔记.String类.StringTest;

public class Test01 {
    public static void main(String[] args) {
        Object obj = new Object();
        // 通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法！
        // 本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。
        System.out.println(obj);


        // 字符串不可变是什么意思？
        // 是说双引号里面的字符串对象一旦创建不可变。
        String s = "abc";   // "abc"放到了字符串常量池当中。"abc"不可变。

        // s变量是可以指向其他对象的。
        // 字符串不可变不是说变量s不可变。说的是"abc"这个对象不可变。
        s = "xyz";      // "xyz"放到了字符串常量池当中。"xyz"不可变。

    }
}
