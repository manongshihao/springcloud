package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker//声明启动数据监控
@EnableHystrixDashboard//声明可视化数据监控
public class hystrixAppcalition {
    public static void main(String[] args) {
        SpringApplication.run(hystrixAppcalition.class,args);
    }
}
