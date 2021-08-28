package de.claudioaltamura.springboot.jib.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = {"/helloworld"})
	public String greet() {
		return "Hello World!";
	}

	@GetMapping(value = {"/health"})
	public String health() { return "OK"; }
}
