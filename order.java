package nguyen;

import java.time.LocalDate;
import java.util.ArrayList;

public class order {
	public  int orderid;
	private LocalDate orderdate;
	public int count;
	public ArrayList<OrderDetail> lineitems;
	
	public order(int orderid, LocalDate orderdate) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
	}

	public int getOrderid() {
		return orderid;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public ArrayList<OrderDetail> getLineitems() {
		return lineitems;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", orderdate=" + orderdate + ", count=" + count + ", lineitems="
				+ lineitems + "]";
	}

	public void addLineItem(product product, int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
