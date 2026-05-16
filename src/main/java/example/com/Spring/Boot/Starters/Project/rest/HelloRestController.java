package example.com.Spring.Boot.Starters.Project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/test")
    public String sayHello() {
        return "Hello!";
    }

}
