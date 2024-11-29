import java.util.Scanner;
public class Petcare  extends Product
{
	Scanner sin=new Scanner(System.in);
	double weight;
	String name;
	String category;
	double price;
	double quantity;
	int deliveryCharge=40;
	double availavleQuantity;
	
	
	public  Petcare()
	{
		
		
	}
	public Petcare(String category,String name,double price)
	{
		this.name=name;
		this.price=price;
		this.category=category;
	}
	public void  pet(String name,double price,double availavleQuantity,String category,double weight)
	{
			super.product(name,price,availavleQuantity,category);
			this.weight=weight;
	}
	public void show()
	{
			System.out.println("Product Name: "+name);
			System.out.println("Weight: "+weight);
			System.out.println("Product Price: "+price);
			System.out.println("Availavle Quantity: "+availavleQuantity);
			System.out.print("Enter Buying Quantity:  ");
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
				System.out.println("The Products is Out of Stock");
			}
	}
}