import java.util.Scanner;
public class SportsP extends Product
{

    Scanner sin=new Scanner(System.in);
    int deliveryCharge=40;
    int pNo;
    int quantity;
	int available_Quantity;
    String name;
    String category;
    double price;
	
	public SportsP()//empty constructor
	{
		
	}
	
	public SportsP(int available_Quantity, String category, String name, double price)//parameterized constructor
	{
		this.available_Quantity=available_Quantity;
		this.category=category;
		this.name=name;
		this.price=price;
	}
	
	public void gymEquipmnts(String name, double price, int available_Quantity)
	{
		super.product(name,price,availavleQuantity,category);
	}
	public void sportsEquipmts( String name, double price,int available_Quantity)
	{
		super.product(name,price,availavleQuantity,category);
	
	}
	
	public void sportsWear( String name, double price, int available_Quantity)
	{
		super.product(name,price,availavleQuantity,category);
	}
	public void show()
	{
		super.show();
	}
	
}	