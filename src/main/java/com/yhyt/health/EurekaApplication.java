package com.yhyt.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
//@EnableZuulProxy
public class EurekaApplication {

    private static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
        logger.info("eureka integration zuul 启动成功");
    }
}
