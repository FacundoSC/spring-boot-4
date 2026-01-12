package com.faccordoba.todoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class TodoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoapiApplication.class, args);
	}

	/*
	 * 
	 * @Bean
	 * public TodoService todoService(RestClient.Builder builder) {
	 * RestClient restClient =
	 * builder.baseUrl("https://jsonplaceholder.typicode.com").build();
	 * RestClientAdapter adapter = RestClientAdapter.create(restClient);
	 * HttpServiceProxyFactory factory =
	 * HttpServiceProxyFactory.builderFor(adapter).build();
	 * return factory.createClient(TodoService.class);
	 * }
	 * 
	 */

}
