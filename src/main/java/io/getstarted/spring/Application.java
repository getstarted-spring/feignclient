package io.getstarted.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Application {

  public static final void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
