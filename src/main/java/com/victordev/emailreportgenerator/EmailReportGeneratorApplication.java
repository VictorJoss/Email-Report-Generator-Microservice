package com.victordev.emailreportgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmailReportGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailReportGeneratorApplication.class, args);
    }

}
