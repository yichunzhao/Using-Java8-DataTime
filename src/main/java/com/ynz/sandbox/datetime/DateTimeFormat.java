package com.ynz.sandbox.datetime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

    public static void main(String[] args) {
        // Z        zone-offset                 offset-Z          +0000; -0800; -08:00;
        // 2022-10-20T22:59:31+0200
        DateTimeFormatter formatterZ = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

        // z       time-zone name              zone-name         Pacific Standard Time; PST
        // 2022-10-20T22:59:31CEST
        DateTimeFormatter formatterSmallZ = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssz");

        // x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
        // Three S designates a fraction of sec, namely, 1/1000 sec
        // Three x outputs the hour and minute, with a colon, such as '+01:30'
        // 2022-10-20T22:59:31.803+02:00
        DateTimeFormatter formatterSmallX = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSxxx");

        System.out.println("Java 8 ZonedDateTime:  " + ZonedDateTime.now().format(formatterZ));

        System.out.println("Java 8 ZonedDateTime:  " + ZonedDateTime.now().format(formatterSmallZ));

        System.out.println("Java 8 ZonedDateTime:  " + ZonedDateTime.now().format(formatterSmallX));


    }
}
