package com.zhangqi.common.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;
import java.sql.Driver;

/**
 * Created by Administrator on 2018/3/28 0028.
 */
@Configuration
@MapperScan("com.zhangqi.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean("dataSource")
    public ComboPooledDataSource createDateSource() throws PropertyVetoException {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        comboPooledDataSource.setDriverClass(jdbcDriver);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUsername);
        comboPooledDataSource.setPassword(jdbcPassword);
        //设置是否在连接池关闭之前自动提交
        comboPooledDataSource.setAutoCommitOnClose(false);

        return comboPooledDataSource;
    }
}
