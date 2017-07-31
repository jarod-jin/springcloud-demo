package cn.jarod.example.springcloud.demozkclient.client;

import cn.jarod.example.springcloud.demozkclient.client.error.FeignConsumerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value="server",fallback = FeignConsumerClientHystrix.class)
public interface FeignConsumerClient {
    @RequestMapping(method = RequestMethod.POST, value = "/show")
    public String getUser(@RequestParam(value = "id") Long id);
}
