package 笔记.IO流.BufferedReader;

import java.io.*;

/*
BufferedReader：
    带有缓冲区的字符输入流。
    使用这个流的时候不需要自定义char数组，或者不需要自定义byte数组。自带缓冲。
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("路径文件123.后缀");
        // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
        BufferedReader br = new BufferedReader(reader);

        // 读一行
        //String fristLine = br.readLine();

        String s = null;
        while((s = br.readLine())!= null){
            System.out.println(s);
        }

        // 关闭流
        // 对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。（可以看源代码。）
        br.close();
    }
}

class BufferedReaderTest02{
    public static void main(String[] args) {

        try {
            // 流的异常这里情况最好还是直接try处理 不要放出去
            // 自定义异常可放出去，要使用者知道，按情况处理异常。
            // 转换流
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("文件路径.后缀")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}