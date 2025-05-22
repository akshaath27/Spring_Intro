package net.akshaath.springboot.body;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hellocont {
	
	@GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name;
    }

}