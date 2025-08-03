import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current local time: " + now);

        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        ZonedDateTime gmtTime = now.withZoneSameInstant(gmtZone);
        ZonedDateTime istTime = now.withZoneSameInstant(istZone);
        ZonedDateTime pstTime = now.withZoneSameInstant(pstZone);

        System.out.println("Time in GMT: " + gmtTime);
        System.out.println("Time in IST: " + istTime);
        System.out.println("Time in PST: " + pstTime);
    }
}
