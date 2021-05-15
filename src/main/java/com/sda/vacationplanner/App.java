package com.sda.vacationplanner;

import com.sda.vacationplanner.beans.Holiday;
import com.sda.vacationplanner.beans.TravelAgency;
import com.sda.vacationplanner.configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        TravelAgency travelAgencyFromContext = context.getBean(TravelAgency.class);
        travelAgencyFromContext.setMessage("Hooray!!");
        travelAgencyFromContext.hello();
        for (Holiday h : travelAgencyFromContext.getHolidayList()) {
            System.out.println(h);
        }
    }
}
