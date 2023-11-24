package Shop;



import java.util.Scanner;

public class ShoppingMain 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		String cho;
		ShopInfo sf=new ShopInfo();
		Customer cust=new Customer(0, null, null, null);
		RegisterLogin r=new RegisterLogin();
		System.out.println("");
		System.out.println("-----*Medicine Shop*-----");
		System.out.println("");
		System.out.println(" 1.USER");
		System.out.println(" 2.EXIT");
		
		System.out.println("\nEnter Your Choice :");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:


            
			System.out.println(" 1.REGISTER \n 2.LOGIN");
			System.out.println("Enter Your Choice :");
			ch=sc.nextInt();
			if(ch==1)			
			{							
				r.reg();
				System.out.println("\n\t\t --For LOG-IN Press L :");
				cho=sc.next();
				if(cho.equals("L")||cho.equals("l")){
					r.Log(cust);
				}					
			}
			if(ch==2)
			{			
				r.Log(cust);
			}
			break;
		case 2:
			System.out.println("Thanks for stay with us!");
			System.exit(0);
			
		
		}
	}
}
