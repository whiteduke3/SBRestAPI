package com.example.demo2.date;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Datum {
    @Id
    @SequenceGenerator(
            name = "date_sequence",
            sequenceName = "date_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "date_sequence"
    )
    private Long id;
    private String date;

    public Datum() {}

    public Datum(Long id, String date) {
        this.id = id;
        this.date = date;
    }
    public Datum(String date) {
        this.date = date;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
