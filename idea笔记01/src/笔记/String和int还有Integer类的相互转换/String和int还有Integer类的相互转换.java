package 笔记.String和int还有Integer类的相互转换;

/**
 * String int Integer 之间相互转换
 */
public class String和int还有Integer类的相互转换 {
    public static void main(String[] args) {

        // String --> int
        int i1 = Integer.parseInt("100"); // i1是100数字
        System.out.println(i1 + 1); // 101

        // int -- > String
        String s2 = i1 + "";  // "100"字符串
        System.out.println(s2 + 1); // "1001"

        // int --> Integer
        // 自动装箱
        Integer x = 1000;

        // Integer --> int
        // 自动拆箱
        int y = x;

        // String --> Integer
        Integer k = Integer.valueOf("123");

        // Integer --> String
        String e = String.valueOf(k);
    }
}
