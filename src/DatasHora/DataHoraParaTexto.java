package DatasHora;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraParaTexto {
  public static void main(String[] args) {
    LocalDate d01 = LocalDate.parse("2024-07-03");
    LocalDateTime d02 = LocalDateTime.parse("2024-07-03T17:06:13");
    Instant d03 = Instant.parse("2024-07-03T17:06:13Z");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
      .withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

    System.out.println("LocalDate: " + d01.format(fmt1));
    System.out.println("LocalDateTime: " + d02.format(fmt2));
    System.out.println("Instant: " + fmt3.format(d03));
    System.out.println("LocalDateTime (ISO): " + d02.format(fmt4));
  }
}
