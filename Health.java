import java.util.Scanner;
public class Health
{
	
	Scanner sin=new Scanner(System.in);
	int deliveryCharge=40;
	int pNo;
	double availavleQuantity;
	double quantity;
	String name;
	String category;
	double price;
	
	public  Health()
	{
		
		
	}
	public Health(String category,String name,double price,double availavleQuantity)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		this.availavleQuantity=availavleQuantity;
		
	}
	
	public void medicine(String name,double price,double availavleQuantity)
	{
		
		
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Availavle Quantity: "+availavleQuantity);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			
			if(quantity>0 && quantity<=availavleQuantity)
			{
				price=price*quantity;
				availavleQuantity=availavleQuantity-quantity;
				System.out.println("Total Amount: "+price);
				System.out.println("Delivery charge: "+deliveryCharge);
				System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
			}
			else
			{
				System.out.println("The Product is Unavailavle");
			}
	}
	public void firstAid(String name,double price,double availavleQuantity)
	{
			System.out.println("Product Name: "+name);
			System.out.println("Product Price: "+price);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			
			if(quantity>0 && quantity<=availavleQuantity)
			{
			price=price*quantity;
			System.out.println("Total Amount: "+price);
			System.out.println("Delivery charge: "+deliveryCharge);
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge));
			}
			else
			{
				System.out.println("The Product is Unavailavle");
			}
		
	}
}