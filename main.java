package nguyen;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
	   
	    Order order = new Order(1, LocalDate.of(2023, 12, 5));

	   
	    order.addLineItem(new Product("sp1", "bot mi", 5000), 10);
	    order.addLineItem(new Product("sp2", "gao", 16000), 5);
	    order.addLineItem(new Product("sp3", "duong", 11000), 1);
	    order.addLineItem(new Product("sp4", "bot nem", 15000), 1);

	   
	    System.out.println(order.toString());
	}
}
