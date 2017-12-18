package com.gale.basis.client.eureka.controller.discovery;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Yao Gang (thatisgale@gmail.com) on 2017/12/17.
 *
 * @author <a href="mailto:thatisgale AT gmail DOT com">Yao Gang</a>
 */
@RestController
@RequestMapping("/discovery")
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DiscoveryClientController {
    private final DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> findServices() {
        List<String> services =  discoveryClient.getServices();
        log.info("Services: {}", services);
        return services;
    }
}
