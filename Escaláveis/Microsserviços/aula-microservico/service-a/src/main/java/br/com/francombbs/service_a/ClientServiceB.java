package br.com.francombbs.service_a;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "service-two")
public interface ClientServiceB {
}
