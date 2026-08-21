package com.example.serviceone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="service-two")
public interface ServiceTwoClient {
    @GetMapping("/message")
    String getMessage();

    @PostMapping("/message")
    public String postMessage(String entity);
}
