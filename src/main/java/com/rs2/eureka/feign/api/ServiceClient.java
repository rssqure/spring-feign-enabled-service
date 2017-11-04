package com.rs2.eureka.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-eureka-service-provider")
public interface ServiceClient {
    @RequestMapping("/provider/service")
    String service();
}