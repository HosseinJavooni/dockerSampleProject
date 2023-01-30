package com.example.dockerSampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSampleProjectApplication {

		@GetMapping("/hi")
		public String saySomething(){
			return "Hi buddy!";
		}
	public static void main(String[] args) {
		SpringApplication.run(DockerSampleProjectApplication.class, args);
	}

}
