package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
    @RequestMapping("/")
    public String index(){
        System.out.println("index 호출");
//        return "index";
        return "/static/index.html";
//        return "/static/dist/index.html";
    }
}
