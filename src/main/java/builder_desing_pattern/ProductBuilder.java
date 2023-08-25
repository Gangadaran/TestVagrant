package builder_desing_pattern;

public class ProductBuilder {

		private int id;
	    private String name;
	    private double price;
	    private String description;
	    
	public ProductBuilder setId(int id) {
		this.id = id;
		return this;
	}
	public ProductBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public ProductBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	public ProductBuilder setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public Product build() {
		return new Product(id, name, price, description);
	}

}
