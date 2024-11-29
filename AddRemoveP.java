public class AddRemoveP
{
	int pNo;
	double availavleQuantity;
	double quantity;
	String name;
	String category;
	double price;
	private Product[] p;
	private int totalCount;
	public AddRemoveP()
	{
	
	}
	public AddRemoveP(String name,double price,String category)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		p=new Product[200];  
	}
	
	public void setValues(String name,double price,String category)
	{
		this.price=price;
		this.name=name;
		this.category=category;
	}
	
	public void addProduct(Product ob)
	{
		if(totalCount<p.length)
		{
			p[totalCount]=ob;
			availavleQuantity++;
			totalCount++;
		}
		else
		{
			System.out.println("Storage full");
		}
	}
	public void removeProduct(Product ob)
	{
		for(int i=0;i<totalCount;i++)
		{
			if(p[i]==ob)
			{
				p[i] = null;
				System.out.println("Removed");
			}
			else
			{
				System.out.println("Not Removed");
			}
		}
	}
	public void show()
	{
		System.out.println("");
	
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		for(int i=0;i<totalCount;i++)
		{
				p[i].show();
		}
	}
}
