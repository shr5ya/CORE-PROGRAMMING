import java.time.LocalDate;

public class DateArithmetic {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 10, 26);
        System.out.println("Original Date: " + startDate);

        LocalDate dateAfterAdditions = startDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + dateAfterAdditions);

        LocalDate finalDate = dateAfterAdditions.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
