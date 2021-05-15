package com.sda.vacationplanner.configuration;

import java.util.List;

import com.sda.vacationplanner.beans.Holiday;
import com.sda.vacationplanner.beans.TravelAgency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.sda.vacationplanner.beans")
public class AppConfiguration {


    @Bean
    public Holiday christmas() {
        Holiday theChristmas = new Holiday();
        theChristmas.setDay(10);
        theChristmas.setMonth(5);
        theChristmas.setGreeting("Happy new year");
        return theChristmas;
    }

    @Bean
    public Holiday madisepaev() {
        Holiday theMadisepaev = new Holiday();
        theMadisepaev.setDay(10);
        theMadisepaev.setMonth(5);
        theMadisepaev.setGreeting("Happy Madisepaev");
        return theMadisepaev;
    }

    @Bean
    public TravelAgency travelAgency(List<Holiday> holidayList) {
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.setMessage("This is a message from Travel Agency bean");
        travelAgency.setHolidayList(holidayList);
        return travelAgency;
    }
}
