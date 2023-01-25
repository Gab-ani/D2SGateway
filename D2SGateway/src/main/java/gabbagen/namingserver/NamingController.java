package gabbagen.namingserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamingController {
	
	 @GetMapping("/hello")
	 public String getHello() {
		 return "Hello";
	 }
}
