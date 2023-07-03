package week5;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Listdates {
         public static void main(String[] args) {
            List<LocalDate> dates = Arrays.asList(
                    LocalDate.of(2024, 1, 15),
                    LocalDate.of(2023, 3, 10),
                    LocalDate.of(2025, 2, 5),
                    LocalDate.of(2021, 4, 20)
            );

            LocalDate earliestDate = Collections.min(dates);
            LocalDate latestDate = Collections.max(dates);

            System.out.println("Earliest date: " + earliestDate);
            System.out.println("Latest date: " + latestDate);
        }
    }
