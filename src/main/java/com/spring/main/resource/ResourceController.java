package com.spring.main.resource;

import com.spring.main.model.User;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/user")
@RestController
public class ResourceController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        return "User has been added";
    }
}
