package GenericSetMap.generics;

import java.util.Scanner;

import GenericSetMap.generics.entities.Print;



public class Main {
  public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		Print<String> ps = new Print<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
    sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String value = sc.nextLine();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
  }
}
