package com.example.demo_Emp_task_cal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.util.Date;

@SpringBootApplication
public class DemoEmpTaskCalApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoEmpTaskCalApplication.class, args);

        TaskDaysCalculation calculation = new TaskDaysCalculation();
        Date date = new Date();

        calculation.getDate();
    }

}
