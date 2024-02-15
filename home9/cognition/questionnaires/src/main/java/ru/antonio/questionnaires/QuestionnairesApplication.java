package ru.antonio.questionnaires;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuestionnairesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionnairesApplication.class, args);
	}

}
