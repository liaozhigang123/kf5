package 笔记.IO流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 这种方式谨慎使用，这种方式会将原文件清空，然后重新写入。
            //fos = new FileOutputStream("idea笔记01/src/笔记/IO流/Test文件/Test02测试文件.txt");

            // 以追加的方式在文件末尾写入。不会清空原文件内容。
            fos = new FileOutputStream("idea笔记01/src/笔记/IO流/Test文件/Test02测试文件.txt",true);
            // 开始写。
            byte[] bytes = {97,98,99,100};
            // 将byte数组全部写出
            fos.write(bytes);
            // 将byte数组一部分写出！
            fos.write(bytes,0,2); // 在写出ab

            String s = "好好学习，天天向上！";
            byte[] bs = s.getBytes();
            fos.write(bs);

            // 写完之后，最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos == null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
