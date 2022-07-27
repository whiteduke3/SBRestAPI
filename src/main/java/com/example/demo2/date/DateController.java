package com.example.demo2.date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import com.example.demo2.date.DateService;


@RestController
@RequestMapping("api/v1/date")
public class DateController {

    private final DateService dateService;

    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping
    public List<Datum> getDates() {
        return dateService.getDates();
    }

    @PostMapping
    public void addNewDate(@RequestBody Datum date) {
        dateService.addDate(date);
    }

}
