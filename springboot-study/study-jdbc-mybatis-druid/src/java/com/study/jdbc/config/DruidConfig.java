package com.study.jdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
@EnableConfigurationProperties(value = DruidConfigProperties.class)
@SuppressWarnings("all")
public class DruidConfig {
    @Autowired
    private DruidConfigProperties druidConfigProperties;

    @Bean(initMethod = "init")
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(druidConfigProperties.getUsername());
        dataSource.setPassword(druidConfigProperties.getPassword());
        dataSource.setUrl(druidConfigProperties.getJdbcUrl());
        dataSource.setDriverClassName(druidConfigProperties.getDriverClassName());
        dataSource.setInitialSize(druidConfigProperties.getInitialSize());
        dataSource.setMinIdle(druidConfigProperties.getMinIdle());
        dataSource.setMaxActive(druidConfigProperties.getMaxActive());
        dataSource.setMaxWait(druidConfigProperties.getMaxWait());
        dataSource.setFilters(druidConfigProperties.getFilters());
        dataSource.setPoolPreparedStatements(druidConfigProperties.isPoolPreparedStatements());
        return dataSource;
    }

    /**
     * 配置druid管理后台的servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewSerlvet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        // 添加IP白名单
        bean.addInitParameter("allow", "127.0.0.1");
        // 添加IP黑名单，当白名单和黑名单重复时，黑名单优先级更高
        bean.addInitParameter("deny", "192.168.25.123");
        // 添加控制台管理用户
        bean.addInitParameter("loginUsername", "admin");
        bean.addInitParameter("loginPassword", "123456");
        // 是否能够重置数据
        bean.addInitParameter("resetEnable", "false");
        return bean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean frb = new FilterRegistrationBean(new WebStatFilter());
        // 添加过滤规则
        frb.addUrlPatterns("/*");
        // 忽略过滤格式
        frb.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
        return frb;
    }
}
