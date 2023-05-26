package javaders.day23datetime.day24datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime03 {
    public static void main(String[] args) {


        LocalDateTime ltd =LocalDateTime.now();
        System.out.println(ltd);  // 2023-03-21T13:40:40.844623800


        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy - hh:mm a");
        String formatedltd = dtf.format(ltd);
        System.out.println(formatedltd);  /// 21-03-2023 - 01:45 ÖS

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("MMMM/dd-yyyy * HH:mm ");
        String formatedltd1 = dtf1.format(ltd);
        System.out.println(formatedltd1);
    }
}

