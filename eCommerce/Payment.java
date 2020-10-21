package eCommerce;

public class Payment {
	private String billNo;
	private String mode;
	private String date;
	private double ordAmount;
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getOrdAmount() {
		return ordAmount;
	}
	public void setOrdAmount(double ordAmount) {
		this.ordAmount = ordAmount;
	}

}
