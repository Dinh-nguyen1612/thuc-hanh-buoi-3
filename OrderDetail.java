package nguyen;

public class OrderDetail {
	public product product;
	public int quatity;
	
	public OrderDetail(nguyen.product product, int quatity) {
		super();
		this.product = product;
		this.quatity = quatity;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "OrderDetail [product=" + product + ", quatity=" + quatity + "]";
	}
	
}