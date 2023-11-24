package Shop;




import java.util.Date;
public class Bill {
	
	private int billno;
	private double total;
	private double finaltotal;
	private Date today;

	
	public Bill(int billno, double total, double finaltotal, Date today) 
	{
		this.billno = billno;
		this.total = total;
		this.finaltotal = finaltotal;
		this.today = today;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}

}


