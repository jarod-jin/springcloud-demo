package cn.jarod.example.springcloud.demozkclient.controller;

import cn.jarod.example.springcloud.demozkclient.client.FeignConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    private FeignConsumerClient feignConsumerClient;

    @RequestMapping(value = "/clientshow", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam(value = "id") Long id) {
        return feignConsumerClient.getUser(id);
    }

}
