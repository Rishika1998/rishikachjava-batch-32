package week5;
import java.time.LocalDate;
import java.time.Period;
public class Age {
        public static void main(String[] args) {
            LocalDate currentDate = LocalDate.now();
            LocalDate birthdate = LocalDate.of(1991, 6, 13);
            Period age = Period.between(birthdate, currentDate);
            System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
        }
}
