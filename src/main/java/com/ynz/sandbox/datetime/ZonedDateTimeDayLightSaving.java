package com.ynz.sandbox.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ZonedDateTime default using formatter ISO_ZONED_DATE_TIME, including Zone ID
 * ISO_OFFSET_DATE_TIME excluding Zone ID but including ZOne Offset.
 * <p>
 * ZonedDateTime considers Daylight saving time offsets.
 */
public class ZonedDateTimeDayLightSaving {

    public static void main(String[] args) {

        System.out.println("ZonedDateTime: " + ZonedDateTime.now());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println("ZonedDateTime: " + ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        System.out.println("London ZonedDateTime Now:" + ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println("London ZonedDateTime Now in OFFSET_DATE_TIME format: " + ZonedDateTime.now(ZoneId.of("Europe/London"))
                .format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        ZonedDateTime cphTime = ZonedDateTime.now(ZoneId.of("Europe/Copenhagen"));
        ZonedDateTime bjTIme = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(cphTime);
        System.out.println(bjTIme);
    }
}
