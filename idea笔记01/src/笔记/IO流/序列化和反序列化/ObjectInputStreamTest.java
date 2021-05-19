package 笔记.IO流.序列化和反序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.ObjectInputStream;

/*
反序列化
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("idea笔记01/src/笔记/IO流/Test文件/Test06测试文件"));
        // 开始反序列化，读
        Object obj = ois.readObject();
        // 反序列化回来是一个学生对象，所以会调用学生对象的toString方法。
        System.out.println(obj);
        ois.close();

    }

}
