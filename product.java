package nguyen;

public class product {
public String description;
public String productid;
public double price;
@Override
public String toString() {
	return "product [description=" + description + ", productid=" + productid + ", price=" + price + "]";
}
public product(String description, String productid, double price) {
	super();
	this.description = description;
	this.productid = productid;
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

	
}
