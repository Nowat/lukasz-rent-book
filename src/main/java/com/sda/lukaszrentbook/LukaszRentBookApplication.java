package com.sda.lukaszrentbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class LukaszRentBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(LukaszRentBookApplication.class, args);
    }

    @Bean
    @Profile("!production")
        public FlywayMigrationStrategy flywayMigrationStrategy(){
          return flyway -> {
              flyway.clean();
              flyway.migrate();
          };
    }


}
