import java.util.Scanner;
public class Breakfast
{
	
	Scanner sin=new Scanner(System.in);
	int deliveryCharge=40;
	int pNo;
	double availavleQuantity;
	double quantity;
	String name;
	String category;
	double price;
	
	public  Breakfast()
	{
		
		
	}
	public Breakfast(String category,String name,double price,double availavleQuantity)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		this.availavleQuantity=availavleQuantity;
		
	}
	public void  Paratha(String name,double price,double availavleQuantity)
	{
		
		
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Availavle Quantity: "+availavleQuantity);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availavleQuantity)
			{
			availavleQuantity=availavleQuantity-quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
			}
			else
			{
				System.out.println("The Products Is Unavailavle");
			}
		
	}
	
	public void  dim_vaji(String name,double price)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
			
		
	}
	public void  soup(String name,double price)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
	}
	public void  khichuri(String name,double price)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
	}
	public void  nihari(String name,double price)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
	}
}