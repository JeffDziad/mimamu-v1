package com.jeffdziad.mimamuv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //! DB DISABLED
public class MimamuV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MimamuV1Application.class, args);
    }

}
