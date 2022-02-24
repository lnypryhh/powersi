package com.study.powersi.BaseDateType;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        DateAndTime date = new DateAndTime();

        SimpleDateFormat Simple = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");

        final Date date1 = date.date();
        String format = Simple.format(date1);
        System.out.println(format);

    }

    public Date date(){
        Date date = new Date();
        return date;

    }
}
