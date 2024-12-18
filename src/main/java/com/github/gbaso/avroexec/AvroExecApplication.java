package com.github.gbaso.avroexec;

import com.github.gbaso.avroexec.schema.TestMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AvroExecApplication {

  private static final Logger log = LoggerFactory.getLogger(AvroExecApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AvroExecApplication.class, args);
  }

  @Bean
  ApplicationRunner runner() {
    return args -> {
      TestMessage message = TestMessage
          .newBuilder()
          .setKey("hello")
          .setValue("world")
          .build();
      log.info("Built a test message: {}", message);
    };
  }
}
