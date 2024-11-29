import java.lang.*;

public class Customer extends Person
{
	private String address;

	public Customer()
	{
		
	}
	public Customer(String name, String contactNumber,int age,String address)
	{
		super(name,contactNumber,age);
		this.address=address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void show()
	{
		super.show();
		System.out.println("	Address: "+address);
		
	}
}