package 笔记.集合.Collections工具类;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作。
 */
public class CollectionsTest {
    public static void main(String[] args){

        // ArrayList集合表示线程安全的。
        List<String> list  = new ArrayList<>();

        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        List<WuGui> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(8000));
        wuGuis.add(new WuGui(500));
        // 注意：对List集合中元素排序，需要保证List集合中元素实现了：Comparable接口。
        Collections.sort(wuGuis);
        for (WuGui wg : wuGuis) {
            System.out.println(wg);
        }

        // 对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("king3");
        set.add("king1");
        set.add("king2");
        // 将Set集合转换成List集合
        ArrayList<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for (String s : myList) {
            System.out.println(s);
        }

        // 这种方式也可以排序
        // Collections.sort(list集合,比较器对象);

    }
}

class WuGui implements Comparable<WuGui>{
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public int compareTo(WuGui o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }
}















