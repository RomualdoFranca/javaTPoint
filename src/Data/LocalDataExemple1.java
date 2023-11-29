package Data;

import java.time.LocalDate;

public class LocalDataExemple1 {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        LocalDate yesterday = data.minusDays(1);
        LocalDate tomorrow = data.plusDays(1);

        System.out.println("yesterday:" + yesterday);
        System.out.println("today:" + data);
        System.out.println("tomorrow:" + tomorrow);
    }
}
