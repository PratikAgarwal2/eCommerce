package eCommerce;

public class Order {
	private String orderNo;
	private String ordstatus;
	private String orddate;
	private double ordamount;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrdstatus() {
		return ordstatus;
	}
	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}
	public String getOrddate() {
		return orddate;
	}
	public void setOrddate(String orddate) {
		this.orddate = orddate;
	}
	public double getOrdamount() {
		return ordamount;
	}
	public void setOrdamount(double ordamount) {
		this.ordamount = ordamount;
	}
	
}
