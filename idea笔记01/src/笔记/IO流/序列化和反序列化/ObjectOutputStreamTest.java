package 笔记.IO流.序列化和反序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
1、java.io.NotSerializableException:
    Student对象不支持异常！！！

2、参与序列化和反序列化的对象，必须实现Serializable接口。

3、注意：通过源代码发现，Serializable接口只是一个标志接口：
    public interface Serializable{
    }
    这个接口当中什么代码都没有。
    那么它起到一个什么作用呢？
        起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
        Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成
        一个序列化版本号。

4、序列化版本号有什么用？
    java语言中采用什么机制来区分类的？
    第一：首先通过类名进行对比，如果类名一样，肯定不是同一个类。
    第二：如果类名一样，再怎么进行类的区别？靠序列化版本号进行区分。

    最终结论：
        凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号。
        这样，以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类。
    */

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception {
        // 创建java对象
        Student s = new Student(1111,"zhangsan");
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("idea笔记01/src/笔记/IO流/Test文件/Test06测试文件"));
        // 序列化对象
        oos.writeObject(s);
        // 刷新
        oos.flush();
        // 关闭
        oos.close();
    }
}
