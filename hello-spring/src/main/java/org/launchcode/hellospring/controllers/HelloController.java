package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class HelloController {

    //sends all GET requests to /hello to this method below
    @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam String coder) {
        //if entered /hello/?coder=milo would return hello milo on screen

        return "hello" + coder + "!";

    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
