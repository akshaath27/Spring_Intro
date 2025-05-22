package net.akshaath.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/greeting")
	public String welcome() {
		return "hello from bridgelabz";
	}

}