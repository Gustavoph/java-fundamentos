package Interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.entities.CarRental;
import Interfaces.entities.Vehicle;
import Interfaces.services.BrazilTaxService;
import Interfaces.services.RentalService;

/*
 * Interfaces
 * - Utilizados para fazer inversão de controle (IOC)
 * - Estabelece contratos entre serviços, definindo o que um serviço
 * deve por padrão implementar
 * - Com isso podemos ter classes diferentes que implementam a mesma
 * interface, porém funciona de uma meneira diferente, deixando a cargo
 * de quem está usando escolher qual implementação irá usar, para suprir
 * o contrato, semelhante a List que é uma interface e usamos o ArrayList
 * que é a implementação concreda da interface List
 */

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
  }
}
