package 笔记.IO流.文件的复制FileInputStream和FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream + FileOutputStream完成文件的拷贝。
    a、拷贝的过程应该是一边读，一边写。
    b、使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。

 */
public class CopyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建一个输入流对象 (先要有这个文件)
            fis = new FileInputStream("idea笔记01/src/笔记/IO流/Test文件/测试文件Test03.txt");

            // 创建一个输出流对象 (这个文件会自动创建)
            fos = new FileOutputStream("idea笔记01/src/笔记/IO流/Test文件/测试文件Test04.txt");

            // 最核心的：一边读，一边写
            byte[] bytes = new byte[1024]; // 1KB (一次最多拷贝1KB,这个大小可设置，但是不能过于巨大)
            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            // 刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 分开try，不要一起try。
            // 一起try的时候，其中一个出现异常，可能会影响到另一个流的关闭。
            if (fos == null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
