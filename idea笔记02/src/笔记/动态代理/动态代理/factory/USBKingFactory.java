package 笔记.动态代理.动态代理.factory;

import 笔记.动态代理.动态代理.service.UsbSell;

// 目标类
public class USBKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        // 目标方法
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }

    @Override
    public void print() {

    }
}
