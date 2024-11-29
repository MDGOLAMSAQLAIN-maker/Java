import java.util.Scanner;
public class Stationary
{
	
	Scanner sin=new Scanner(System.in);
	int deliveryCharge=40;
	int pNo;
	double availavleQuantity;
	double quantity;
	String name;
	String category;
	double price;
	
	public  Stationary()
	{
		
		
	}
	public Stationary(String category,String name,double price,double availavleQuantity)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		this.availavleQuantity=availavleQuantity;
		
	}
	public void stationary_Items(String name,double price,double availavleQuantity)
	{
		
		
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price+"tk");
			System.out.println("Availavle Quantity: "+availavleQuantity+"pc");
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availavleQuantity)
			{
			availavleQuantity=availavleQuantity-quantity;
			System.out.println("Total Amount: "+price+"tk");
			System.out.println("Delivery charge: "+deliveryCharge+"tk");
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+"tk");
			}
			else
			{
				System.out.println("The Products Is Unavailable");
			}
		
	}
	
	public void  books(String name,double price,double availavleQuantity)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price+"tk");
			System.out.println("Availavle Quantity: "+availavleQuantity+"pc");
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availavleQuantity)
			{
			availavleQuantity=availavleQuantity-quantity;
			System.out.println("Total Amount: "+price+"tk");
			System.out.println("Delivery charge: "+deliveryCharge+"tk");
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+"tk");
			}
			else
			{
				System.out.println("The Products Is Unavailable");
			}
				
	}
	public void office_Supplies(String name,double price,double availavleQuantity)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price+"tk");
			System.out.println("Availavle Quantity: "+availavleQuantity+"pc");
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availavleQuantity)
			{
			availavleQuantity=availavleQuantity-quantity;
			System.out.println("Total Amount: "+price+"tk");
			System.out.println("Delivery charge: "+deliveryCharge+"tk");
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+"tk");
			}
			else
			{
				System.out.println("The Products Is Unavailable");
			}
	}
}