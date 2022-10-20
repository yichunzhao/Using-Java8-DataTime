package com.ynz.sandbox.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertZonedDateTimeToAnotherZone {

    public static void main(String[] args) {
        System.out.println("current local dateTime: ");
        System.out.println(LocalDateTime.now());

        System.out.println("covert a localDateTime to its zonedTime.");
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Shanghai")));

        System.out.println("Covert a Zoned DateTime to another Zone");
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Shanghai")));
    }
}
