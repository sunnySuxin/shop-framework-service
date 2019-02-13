package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * framework启动类
 *
 * @author suxin
 * @date 2019.2.13
 */
@SpringBootApplication
@EnableEurekaClient
public class ShopFrameworkService {

    public static void main(String[] args) {
        SpringApplication.run(ShopFrameworkService.class, args);
    }

}

