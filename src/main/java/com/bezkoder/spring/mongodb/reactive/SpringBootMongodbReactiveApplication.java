package com.bezkoder.spring.mongodb.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SpringBootMongodbReactiveApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMongodbReactiveApplication.class, args);
  }

}
