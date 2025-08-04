package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) throws Exception {
        LOGGER.info("START: SpringLearnApplication");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayDate();
        LOGGER.info("END: SpringLearnApplication");
    }

    public static void displayDate() throws Exception {
        LOGGER.info("START: displayDate");

        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        Date parsedDate = format.parse("31/12/2018");
        LOGGER.debug("Parsed Date: {}", parsedDate.toString());

        LOGGER.info("END: displayDate");
    }
}
