package cn.zdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("cn.zdp.service")
public class FeignConsumerApp_80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApp_80.class,args);
    }
}
