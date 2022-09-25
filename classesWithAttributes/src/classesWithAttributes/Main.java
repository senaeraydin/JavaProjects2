package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// Product product = new Product();
		// product. name = "Laptop";
		// product. id = 1;
		// product. description = "Asus Laptop";
		// product. price = 5000;
		// product. stockAmount = 3;
		
		
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");
		// product.setName("Laptop");
		// product.setDescription("Asus Laptop");
		// product.setPrice(5000);
		// product.setStockAmount(3);
		// product.setId(1);
		System.out.println(product.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		

	}

}
