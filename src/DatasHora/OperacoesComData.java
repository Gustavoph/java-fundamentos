package DatasHora;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Data-hora LOCAL
 * - LocalData
 * - LocalDateTime
 * 
 * Data-hora GLOBAL
 * - Instant
 * 
 * Duração
 * - Duration
 * 
 * Outros
 * - ZoneId
 * - ChronoUnit
*/

public class OperacoesComData {
  public static void main(String[] args) {
    LocalDate d01 = LocalDate.now();
    System.out.println("LocalData: " + d01);

    LocalDateTime d02 = LocalDateTime.now();
    System.out.println("LocalDataTime: " + d02);

    Instant d03 = Instant.now();
    System.out.println("Instant (GMT): " + d03);

    LocalDate d04 = LocalDate.parse("2022-07-20");
    System.out.println("LocalDate (Parse): " + d04);

    LocalDateTime d05 = LocalDateTime.parse("2022-07-20T17:51:23");
    System.out.println("LocalDateTime (Parse): " + d05);

    Instant d06 = Instant.parse("2022-07-20T17:51:23Z");
    System.out.println("Instant (Parse): " + d06);
    
    Instant d07 = Instant.parse("2022-07-20T17:51:23-03:00");
    System.out.println("Instant (Parse): " + d07);

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
    System.out.println("Format dd/MM/yyyy: " + d08);

    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime d09 = LocalDateTime.parse("20/07/2022 17:30", fmt2);
    System.out.println("Format dd/MM/yyyy HH:mm: " + d09);

    LocalDate d10 = LocalDate.of(2024, 7, 3);
    System.out.println("LocalDate Of: " + d10);

    LocalDateTime d11 = LocalDateTime.of(2024, 7, 3, 17, 30);
    System.out.println("LocalDateTime Of: " + d11);
  }
}
