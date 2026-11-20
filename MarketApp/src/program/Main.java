package program;

import java.util.Locale;
import java.util.Scanner;

import model.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("========== MARKET ==========");
		System.out.print("Input product name: ");
		product.name = sc.nextLine();
		System.out.print("Input product price: ");
		product.price = sc.nextDouble();
		System.out.print("Input current stock: ");
		product.stock = sc.nextInt();
		
		System.out.printf(product.displayInformation());
		
		sc.close();
		
	}

}
