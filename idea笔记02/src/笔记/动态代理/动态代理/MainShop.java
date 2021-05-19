package 笔记.动态代理.动态代理;

import 笔记.动态代理.动态代理.factory.USBKingFactory;
import 笔记.动态代理.动态代理.handler.MySellHandler;
import 笔记.动态代理.动态代理.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        // 创建代理对象，使用Proxy

        // 1、创建目标对象
        //USBKingFactory factory = new USBKingFactory();
        UsbSell factory = new USBKingFactory();

        // 2、创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);

        // 3、创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),handler);

        // com.sun.proxy.$Proxy0：这是jdk动态代理创建的对象类型。
        System.out.println("proxy:" + proxy.getClass().getName());

        // 4、通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法：" + price);
    }
}
