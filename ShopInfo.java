package Shop;

import java.util.Scanner;
import java.util.Date;
public class ShopInfo {
	int ch,i;
	
	public Customer accept() 
	{
		Scanner sc=new Scanner(System.in);

			System.out.println("\nEnter Customer id :");
			int custId=sc.nextInt();
			
			System.out.println("Enter Customer Name :");
			String custName=sc.next();
			
			
			System.out.println("Enter City :");
			String ct=sc.next();

			

			System.out.println("Enter Post Code :");
			int postcode=sc.nextInt();
			
			
			Address addr=new Address(ct,postcode);

			System.out.println("\nHow many priduct you want to buy? ");
			int n = sc.nextInt();
			Product prodarr[]=new Product[n];
			System.out.println("\n\n**You can purchase products Now ...");
			for( i=0;i<prodarr.length;i++) {
				Product pobj=new Product();

				System.out.println("\nProduct ID of  Product "+(i+1)+" :");
				pobj.setProdId(sc.nextInt());

				System.out.println("Product Name of Product "+(i+1)+" :");
				pobj.setProdName(sc.next());

				System.out.println("Product Price of  Product "+(i+1)+" :");
				pobj.setProdPrice(sc.nextDouble());

				System.out.println("Product Quantity of Product "+(i+1)+" :");
				pobj.setQuantity(sc.nextInt());

				prodarr[i]=pobj;
				System.out.println("\n");	
		}
		
			Customer cust=new Customer(custId, custName, addr,prodarr);
		return cust;
	}
	public void calculate(Customer cust) 
	{
		double total=0,finaltotal;
		
		
		Product arr[]=cust.getProd();
		
		for(Product p:arr)
		{
			total=total+(p.getProdPrice()*p.getQuantity());
		}
		
		finaltotal=total;
		Date d=new Date();
		
		Bill bill=new Bill(501,total,finaltotal,d);
		cust.setBill(bill);

	}
	public void display(Customer cust)
	{
		System.out.println("----------------*CUSTOMER DETAILS*----------------\n");
		System.out.println("Customer Id :" +cust.getCustId());
		System.out.println("Customer Name :"+cust.getCustName());
	}
	public void Billdetails(Customer cust)
	{
		System.out.println("\n\t----------------------------*BILL DETAILS*----------------------------");
		Bill bill=cust.getBill();
		
		System.out.println("\tTOTAL :"+cust.getBill().getTotal());
		
		System.out.println("\tFinal Total :"+cust.getBill().getFinaltotal());
		System.out.println("\tDate of Bill :"+cust.getBill().getToday());		
		System.out.println("\t----------------------------------------------------------------------");

	}
	public void AddrProd(Customer cust)
	{
		System.out.println("\n\t--------------------*ADDRESS DETAILS*--------------------");
		Address a =cust.getAddr();
		System.out.println("\n\tCustomer City\tCustomer Postcode");
		System.out.println("\n\t"+cust.getAddr().getCity()+"\t\t"+cust.getAddr().getPostcode());
		System.out.println("\t---------------------------------------------------------");

		System.out.println("\n\t--------------------------*Product LIST*-------------------------------");
		Product prodarr[]=cust.getProd();
		System.out.println("\n\tProduct Id \tProduct Name \tProduct Price \tProduct quantity");
		System.out.println("\t.....................................................................");

		for(i=0;i<prodarr.length;i++) 
		{
			System.out.println("\t"+prodarr[i].getProdId()+" \t\t"+prodarr[i].getProdName()+" \t\t"+prodarr[i].getProdPrice()+"\t\t"+prodarr[i].getQuantity());
		}
		System.out.println("\t-----------------------------------------------------------------------");
		
	}
}


