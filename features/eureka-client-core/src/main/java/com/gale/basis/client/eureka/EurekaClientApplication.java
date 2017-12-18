package com.gale.basis.client.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Yao Gang (thatisgale@gmail.com) on 2017/12/17.
 *
 * @author <a href="mailto:thatisgale AT gmail DOT com">Yao Gang</a>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class)
                .web(true).run(args);
    }
}
