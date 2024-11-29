import java.util.Scanner;
public class Lunch
{
	
	Scanner sin=new Scanner(System.in);
	int deliveryCharge=50;
	int pNo;
	double availableQuantity;
	double quantity;
	String name;
	String category;
	double price;
	
	public  Lunch()
	{
		
		
	}
	public Lunch(String category,String name,double price,double availableQuantity)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		this.availableQuantity=availableQuantity;
		
	}
	public void kacchi(String name,double price,double availableQuantity)
	{
		
		
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Available Quantity: "+availableQuantity);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availableQuantity)
			{
			availableQuantity=availableQuantity-quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
			}
			else
			{
				System.out.println("The Products Is Unavailavle");
			}
		
	}
	
	public void  biriyani(String name,double price)
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
	public void  polao(String name,double price)
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
	public void  kalavuna(String name,double price)
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
	public void  chaumin(String name,double price)
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