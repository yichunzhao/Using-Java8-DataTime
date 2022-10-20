package com.ynz.sandbox.datetime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java8DateTime {

    public static void main(String[] args) {
        // java 8 zonedDateTime:  2022-10-18T20:44:14.810+02:00[Europe/Copenhagen]
        // convert to instant
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSxxx");
        Instant instantNow = ZonedDateTime.now().toInstant();
        System.out.println("Java 8 ZonedDateTime:  " + ZonedDateTime.now());

        // convert instant to a localDateTime in a zone +8
        LocalDateTime instantNowAtZone2 = LocalDateTime.ofInstant(instantNow, ZoneOffset.ofHours(+7));
        System.out.println("At Zone 7: " + instantNowAtZone2);
        System.out.println("At Zone UTC: " + LocalDateTime.ofInstant(instantNow,ZoneOffset.UTC));

    }
}
