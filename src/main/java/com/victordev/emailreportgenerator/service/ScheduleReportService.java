package com.victordev.emailreportgenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleReportService {

    @Autowired
    private FileOSService fileOSService;

    @Autowired
    private EmailService emailService;

    private List<String> emailList = Arrays.asList("victorstudio11@gmail.com");

    private final Integer SEVEN_DAYS_IN_MILISECONDS = 604800000;

    @Scheduled(fixedRate = SEVEN_DAYS_IN_MILISECONDS)
    public void sendReport(){
        try {
            String report = fileOSService.getReportFileContent("report.html");

            for(String email: emailList){
                emailService.sendReport(report, email);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
