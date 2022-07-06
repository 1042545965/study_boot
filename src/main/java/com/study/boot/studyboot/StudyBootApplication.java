package com.study.boot.studyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudyBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(StudyBootApplication.class, args);

		String[] definitionNames = run.getBeanDefinitionNames();

		for (int i = 0; i < definitionNames.length; i++) {
			String definitionName = definitionNames[i];
			System.out.println(definitionName);
		}


	}

}
