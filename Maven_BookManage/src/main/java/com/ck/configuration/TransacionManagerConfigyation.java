package com.ck.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author longhuan
 * @create 2021-04-27-16:24
 */
@Configuration
@EnableTransactionManagement
public class TransacionManagerConfigyation {
    @Autowired
    private ComboPooledDataSource c3p0;

    @Bean
    //配置事务管理器
    public DataSourceTransactionManager transactionManager(){
        //创建事务管理器
        DataSourceTransactionManager ma=new DataSourceTransactionManager();
        //给ma设置数据源
        ma.setDataSource(c3p0);
        return ma;
    }
}
