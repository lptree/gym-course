package com.letgym.gymcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GymCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymCourseApplication.class, args);
	}
}
