package 笔记.集合.集合总结;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        // 创建对象
        Properties pro = new Properties();
        // 存
        pro.setProperty("username","zhangsan");
        pro.setProperty("password","test123");
        // 取
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(username);
        System.out.println(password);

    }
}
