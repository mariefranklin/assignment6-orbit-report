package org.LaunchCode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    //Handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
//lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    // create a handler that handles requests of the form /hello?name=LaunchCode
    @RequestMapping (value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting = "Hello. " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // handles request of the form /hello/LaunchCOde
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model){
        String greeting = "Hello. " + name + "!";
        model.addAttribute("greeting", greeting);
            return "hello";
    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
        }
     @GetMapping ("hello-names")
     public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-lst";
        }
    }
