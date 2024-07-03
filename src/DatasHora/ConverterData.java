package DatasHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterData {
  public static void main(String[] args) {
    // Converter data global para local

    Instant d01 = Instant.parse("2024-07-03T18:00:21Z");
    LocalDate c01 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
    LocalDateTime c02 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
    LocalDate c03 = LocalDate.ofInstant(d01, ZoneId.of("Portugal"));
    LocalDateTime c04 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));

    System.out.println("Instant: " + d01);
    System.out.println("Instant to LocalDate: " + c01);
    System.out.println("Instant to LocalDateTime: " + c02);
    System.out.println("Instant to LocalDate W/ Time Zone: " + c03);
    System.out.println("Instant to LocalDate W/ Time Zone: " + c04);

    System.out.println("Dia: " + c02.getDayOfMonth());
    System.out.println("Mes: " + c02.getMonth());
    System.out.println("Ano: " + c02.getYear());

    System.out.println("Hora: " + c02.getHour());
    System.out.println("Minuto: " + c02.getMinute());
    System.out.println("Segundo: " + c02.getSecond());
  }
}
