package br.com.jamesson.testchatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestChatgptApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestChatgptApplication.class, args);
  }

}
