package com.example.usa;
// This class implements Singlonton Design patteren


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeTable {

    @RequestMapping("/timetable")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot";
    }


}
