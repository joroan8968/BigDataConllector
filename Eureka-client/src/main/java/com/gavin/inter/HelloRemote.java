package com.gavin.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-userinfo")
public interface HelloRemote {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name);
}
