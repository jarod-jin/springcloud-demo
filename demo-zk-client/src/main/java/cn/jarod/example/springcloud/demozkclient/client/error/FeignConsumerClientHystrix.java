package cn.jarod.example.springcloud.demozkclient.client.error;

import cn.jarod.example.springcloud.demozkclient.client.FeignConsumerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class FeignConsumerClientHystrix implements FeignConsumerClient {

    @Override
    public String getUser(@RequestParam("id") Long id) {
        return "error";
    }
}
