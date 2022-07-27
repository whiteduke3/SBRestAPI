package com.example.demo2.date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateService {

    private final DateRepository dateRepository;

    @Autowired
    public DateService(DateRepository dateRepository) {
        this.dateRepository = dateRepository;
    }

    public List<Datum> getDates() {
        return dateRepository.findAll();
    }

    public void addDate(Datum date) {
        dateRepository.save(date);
    }
}
