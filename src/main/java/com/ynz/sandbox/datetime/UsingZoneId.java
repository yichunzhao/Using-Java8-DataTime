package com.ynz.sandbox.datetime;

import java.time.*;

public class UsingZoneId {

    public static void main(String[] args) {
        // create an Instant object
        Instant instant
                = Instant.parse("2018-12-17T19:59:44.770Z");
        System.out.println(instant);

        LocalDateTime atCph = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Copenhagen"));
        System.out.println("local "+atCph);

        System.out.println(ZonedDateTime.ofInstant(instant, ZoneOffset.ofHours(+8)));

        System.out.println("system default zoneId: "+ ZoneId.systemDefault());

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(ZoneId.systemDefault().normalized());

    }
}
