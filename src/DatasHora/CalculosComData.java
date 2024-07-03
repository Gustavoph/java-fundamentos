package DatasHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComData {
  public static void main(String[] args) {
    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate pastWeekLocalDate = d01.minusDays(7);
    LocalDate nextWeekLocalDate = d01.plusDays(7);

    System.out.println("Past week LocalDate: " + pastWeekLocalDate);
    System.out.println("Next week LocalDate: " + nextWeekLocalDate);
    
    LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
    LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

    System.out.println("Past week LocalDateTime: " + pastWeekLocalDateTime);
    System.out.println("Next week LocalDateTime: " + nextWeekLocalDateTime);

    Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

    System.out.println("Past week Instant: " + pastWeekInstant);
    System.out.println("Next week Instant: " + nextWeekInstant);

    System.out.println("==================================");

    Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), d02);
    Duration t02 = Duration.between(pastWeekLocalDateTime, d02);
    Duration t03 = Duration.between(pastWeekInstant, d03);
    
    System.out.println("Diferença LocalDate: " + t01.toDays());
    System.out.println("Diferença LocalDateTime: " + t02.toDays());
    System.out.println("Diferença Instant: " + t03.toDays());
  }
}
