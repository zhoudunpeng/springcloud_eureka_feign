package cn.zdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApp7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp7003.class,args);
    }
}
