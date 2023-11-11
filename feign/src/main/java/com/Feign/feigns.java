package com.Feign;

import com.Feign.iml.feigniml;
import com.Model.student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provied",fallback = feigniml.class)
public interface feigns {
    @GetMapping("/filldll")
    public Collection<student> filldll();
}
