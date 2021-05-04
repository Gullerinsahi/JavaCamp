package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		product Product = new Product(1,"Laptop","Asus Laptop", 5000,"3" );
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		
		
	}

}
