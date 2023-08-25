package builder_desing_pattern;

public class Example {
	
	public static void main(String[] args) {
		Product product = new ProductBuilder()
				.setId(1)
				.setDescription("Gangadaran").build();
		
		
		System.out.println(product.toString());
		
		
	}

}
