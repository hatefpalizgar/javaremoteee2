package com.sda.vacationplanner.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelAgency {
    private List<Holiday> holidayList;
    private String message;

    public void hello() {
        System.out.println("hello() from TravelAgency class: " + message);
    }

    public List<Holiday> getHolidayList() {
        return holidayList;
    }

    @Autowired  // Setter injection
    public void setHolidayList(List<Holiday> holidayList) {
        this.holidayList = holidayList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TravelAgency {" +
                "holidayList=" + holidayList +
                ", message='" + message + '\'' +
                '}';
    }
}
