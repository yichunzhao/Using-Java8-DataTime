package com.ynz.sandbox.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * ZoneId, a string, stands for a Time Zone, fx. Europe/London, Asio/Shanghai
 * Using ZoneId may convert a DateTime from one zone ref. to another zone.
 */
public class ConvertBetweenZonedDateTimesUsingZoneId {

    public static void main(String[] args) {
        // Create an Instant object ref. to UTC
        Instant instant = Instant.parse("2018-12-17T19:59:44.770Z");
        System.out.println(instant);

        // convert UTC to CET at the same time.
        ZonedDateTime atCph = instant.atZone(ZoneId.of("Europe/Copenhagen"));

        // Output: 2018-12-17T20:59:44.770+01:00[Europe/Copenhagen]
        System.out.println("Convert an instance at another Zone " + atCph);
    }
}
