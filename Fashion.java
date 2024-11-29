import java.util.Scanner;
public class Fashion extends Product
{
	String size;
	public  Fashion()
	{
	}
	public void fashion(String pName,double price,String category,int availavleQuantity,String size)
	{
		super.product(pName,price,availavleQuantity,category);
		this.size=size;
	}
	public void show()
	{
		Scanner sin=new Scanner(System.in);
			System.out.println("Product Category: "+category);
			System.out.println("Product Name: "+pName);
			System.out.println("Size: "+size);
			System.out.println("Product Price: "+price+" Taka");
			System.out.println("Availavle Quantity: "+availavleQuantity);
			System.out.println("Enter Buying Quantity: ");
			quantity=sin.nextDouble();
			price=price*quantity;
			if(quantity>0 && quantity<=availavleQuantity)
			{
			System.out.println("Total Amount: "+price+" Taka");
			System.out.println("Delivery charge: "+deliveryCharge+" Taka");
			System.out.println("Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+" Taka");
			}
			else
			{
				System.out.println("The Products is Out of Stock");
			}
		
		
	}
}