package com.example.serviceorder.client;

import com.example.commonutils.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("service-ucenter")
public interface UcenterClient {

    @GetMapping("/serviceucenter/member/getInfoUc/{id}")
    UserVo getInfoById(@PathVariable String id);

}
