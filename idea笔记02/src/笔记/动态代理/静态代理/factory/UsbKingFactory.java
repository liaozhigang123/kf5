package 笔记.动态代理.静态代理.factory;

import 笔记.动态代理.静态代理.service.UsbSell;

// 目标类：金士顿厂家，不接受用户的单独购买。
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法调用，USBKingFactory中的sell");
        // 一个128G的U盘是85元。
        // 后期跟据amount，可以实现不同的价格，例如10000个，单价是80,50000个75
        return 85.0f;
    }
}
