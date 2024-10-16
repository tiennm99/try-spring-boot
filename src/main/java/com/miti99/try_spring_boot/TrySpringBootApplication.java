package com.miti99.try_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.miti99.try_spring_boot")
public class TrySpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(TrySpringBootApplication.class, args);
  }
}
