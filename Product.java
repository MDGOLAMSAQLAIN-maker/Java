import java.util.Scanner;
public class Product
{
	
	int deliveryCharge=40;
	int pNo;
	double availavleQuantity;
	double quantity;
	String pName;
	String category;
	double price;
	int pId;
	static double total;
	public Product()
	{
	}
	
	public Product(String pName,double price,double availavleQuantity,String category)
	{
		this.pName=pName;
		this.price=price;
		this.category=category;
	}
	public void setName(String pName)
	{
		this.pName=pName;
	}
	public String getName()
	{
		return pName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setAvaiavleQuantity(double availavleQuantity)
	{
		this.availavleQuantity=availavleQuantity;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public void setPID(int pId)
	{
		this.pId=pId;
	}
	public double getPrice()
	{
		return price;
	}
	public double getAvailavleQuantity()
	{
		return availavleQuantity;
	}
	public String getCategory()
	{
		return category;
	}
	
	public int getPID()
	{
		return pId;
	}
	public void product(String pName,double price,double availavleQuantity,String category)
	{
		this.pName=pName;
		this.price=price;
		this.availavleQuantity=availavleQuantity;
		this.category=category;
	}
	
	public void show()
	{
			Scanner sin=new Scanner(System.in);
			System.out.println("Product Category: "+category);
			System.out.println("Product Name: "+pName);
			System.out.println("Product Price: "+price+" Taka");
			System.out.println("Availavle Quantity: "+availavleQuantity+" KG");
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			
			if(quantity>0 && quantity<=availavleQuantity)
			{
			price=price*quantity;
			System.out.println("Total Amount: "+price+" Taka");
			System.out.println("Delivery charge: "+deliveryCharge+" Taka");
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+" Taka");
			System.out.println("Total amount: "+(total+price));
			}
			else
			{
				System.out.println("The Products is Out of Stock");
			}
		
	}
}