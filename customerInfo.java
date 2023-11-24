package Shop;


import java.util.Scanner;
public class customerInfo {
	private String phone;  
    private String name;  
    private String gender;  
    private double balance;  
    private String pw;
    
	public void setName(String name) 
	{
		this.name = name;
	}
    public String getName() 
    {
		return name;
	}
	public void setPin(String pin)
	{
		this.pw = pin;
	}
	public String getPin() 
	{
		return pw;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setAccno(String accno)
	{
		this.phone = accno;
	}
	public String getAccno()
	{
		return phone;
	}
	public void setAcc_type(String acc_type) 
	{
		this.gender = acc_type;
	}
	public String getAcc_type() 
	{
		return gender;
	}

}
