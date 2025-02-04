package HerancaPolimorfismo.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import HerancaPolimorfismo.metodosAbstratos.entities.Circle;
import HerancaPolimorfismo.metodosAbstratos.entities.Rectangle;
import HerancaPolimorfismo.metodosAbstratos.entities.Shape;
import HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

/*
 * Métodos abstratos
 * 
 * - São métodos que não possuem implementação
 * - Métodos precisam ser abstratos quando a classe é genérica demais
 * para conter sua implementação
 * - Se uma classe possuir pelo menos um método abstrato,
 * então esta classe também é abstrata
 */

public class Main {
  public static void main(String[] args) {
    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(width, height, color));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
  }
}
