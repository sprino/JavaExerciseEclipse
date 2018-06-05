package it.begear.gsconsuminggreeting.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GsConsumingController {
	
		@Autowired
		private RestTemplate restTemplate;
		
		@Bean
		public RestTemplate restTemplete(RestTemplateBuilder builder) {
			return builder.build();
		}
		
		@GetMapping("/greetingmicro")
		Object getGreetingByAnotherMicroservice() throws IOException {
			Object forObject = restTemplate.getForObject("http://localhost:8080/greeting", Object.class);
			System.out.println(forObject);
			return forObject;
		}
}
