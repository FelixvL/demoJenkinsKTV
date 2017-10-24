package demo.cd.autodeploy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGo {
	@GetMapping("/go")
	public String go() {
		return "Hoi, daar zijn we";
	}
}
