
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the maximum price of the product");
		double price = Double.parseDouble(br.readLine());

		Product product = new Product();

		List<Product> filteredList = product.filterProducts(price);

		if (filteredList.isEmpty()) {
			System.out.println("No products found within the given price");
		} else {
			System.out.println("List of Filtered Products");
			System.out.format("%-20s %-20s %-20s %-10s %s\n", "Name", "Brand", "Category", "Color", "Price");

			filteredList.forEach(p -> System.out.format("%-20s %-20s %-20s %-10s %s\n", p.getName(), p.getBrand(),
					p.getProductCategory(), p.getColor(), p.getPrice()));

		}
	}

}
