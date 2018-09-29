package cn.jarod.example.springcloud.demozksrv.controller;


import cn.jarod.example.springcloud.demozksrv.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperServiceRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class ZkServerController {

    @Autowired
    private UserDTO dto;

//    @Autowired
//    private ZookeeperServiceRegistry serviceRegistry;

    @RequestMapping(value = "/show", method = {RequestMethod.POST})
    @ResponseBody
    public UserDTO show(@RequestParam(value="id") Long id) {
//        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setName("hello,buddy");
        dto.setBirthday(new Date());
        return dto;
    }


}
