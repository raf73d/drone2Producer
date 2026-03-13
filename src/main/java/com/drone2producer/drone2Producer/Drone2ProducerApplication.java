package com.drone2producer.drone2Producer;

import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Drone2ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Drone2ProducerApplication.class, args);
	}
        
        @Bean 
JacksonJsonMessageConverter converter() { 
return new JacksonJsonMessageConverter(); 
} 

}
