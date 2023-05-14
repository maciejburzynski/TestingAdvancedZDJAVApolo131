package sda.TestingZDJAVApolo131.testingadvanced.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldRestController {


    @GetMapping("/hello-world")
    public String hello(){
        return "Hello World";
    }

}
