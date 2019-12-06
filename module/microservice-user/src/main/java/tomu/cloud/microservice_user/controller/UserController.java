package tomu.cloud.microservice_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tomu.cloud.microservice_user.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/getuser")
    @ResponseBody
    public String getUser() {

        return userService.getUser() + ":" + appName + "port:" + serverPort;
    }

    @GetMapping("/test")
    public String test() {

        return "test";
    }

}
