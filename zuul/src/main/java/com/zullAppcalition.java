package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
//一个配置是设置为网关启动类
//一个是将所有符合条件的configuration类加载到当前的springboot创建并使用的ioc容器中
public class zullAppcalition {
    public static void main(String[] args) {
        SpringApplication.run(zullAppcalition.class,args);
    }
}
