import java.util.Scanner;
public class Food extends Product
{
	String makingPlace;
	double weight;
	public  Food()
	{
	}
	public void food(String pName,double price,double availavleQuantity,String category,String makingPlace)
	{
		super.product(pName,price,availavleQuantity,category);
		this.makingPlace=makingPlace;
	}
	public void meat(String pName,double price,double availavleQuantity,String category,double weight)
	{
		super.product(pName,price,availavleQuantity,category);
		this.weight=weight;
	}
	public void showMeat()
	{
			System.out.println("Weight: "+weight+ "KG");
			super.show();
	}
	public void show()
	{
		System.out.println("Cultivated or Made: "+makingPlace);
		super.show();
	}
}