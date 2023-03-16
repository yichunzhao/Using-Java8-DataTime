# Using-Java8-DateTime

## Terms
ZoneId: A time-zone ID, such as Europe/Paris, Europe/Lodon, Asia/Shanghai

ZoneOffset: extends form ZoneId. A time-zone offset from Greenwich/UTC, such as +02:00.


## Coverting DateTime between TimeZones

Instants are referred to UTC, therefore converting ZonedDateTime between different ZoneId can based on a common ground, i.e. instant. 
