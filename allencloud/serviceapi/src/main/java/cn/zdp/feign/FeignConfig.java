package cn.zdp.feign;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "enjoy");
    }
}
