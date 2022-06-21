package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用Nacos作为配置中心 统一管理配置
 *   1.引人依赖  spring-cloud-starter-alibaba-nacos-config
 *   2.创建一个bootstrap.properties文件中的下列两项
 *       spring.application.name=gulimall-coupon
 *       spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *   3.需要给配置中心默认配置一个数据集 应用名.properties
 *   4.给应用名.properties 添加任何配置
 *
 *   5.动态获取配置
 *    @RefreshScope :动态获取并刷新配置
 *    @Value("{配置项的名}") : 获取到配置
 */
@SpringBootApplication
@EnableDiscoveryClient //服务注册发现功能
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
