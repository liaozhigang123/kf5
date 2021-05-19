package 笔记.数组.数组Test;

public class ArrayTest {
    public static void main(String[] args) {
        // 声明一个int类型的数组，使用静态初始化的方式
        // java数组风格
        int[] a = {1,100,10,20,55,689};

        // 这是C++风格，不建议java中使用。
        // int a[] = {1,100,10,20,55,689};

        // 所有的数组对象都有length属性
        System.out.println("数组中的元素的个数"+a.length);

        // 数组中每一个元素都有下标
        // 通过下标对数组中元素进行存和取
        // 取(读)
        System.out.println("第一个元素 = " + a[0]);
        System.out.println("最后一个元素 = " + a[5]);
        System.out.println("最后一个元素 = " + a[a.length - 1]);

        // 存(改)
        // 把第一个元素修改为111
        a[0] = 111;
        // 把最后一个元素修改为100
        a[a.length-1] = 100;

        System.out.println("第一个元素 = " + a[0]);
        System.out.println("最后一个元素 = " + a[a.length - 1]);
    }
}
