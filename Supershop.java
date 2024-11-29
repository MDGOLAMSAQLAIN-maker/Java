public class Supershop implements EmployeeOperation,CustomerOperation,ProductOperation
{
	Customer [] customer;
	Employee [] employee;
	private Product[] p;
	int totalCount;
	int availavleQuantity;
	String name;
	int size;
	int size1;
	int size3;
	
	public Supershop(String name,int size,int size1,int size2)
	{
		this.name=name;
		customer=new Customer[size];
		employee=new Employee[size1];
		p=new Product[size3];
		
	}
	public void addCustomer(Customer c)
	{
		if(totalCount<customer.length)
		{
			customer[totalCount]=c;
			totalCount++;
			System.out.println("	This Customer added successfully");
			c.show();
		}
		else
		{
			System.out.println("	Failed! Not added");
		}
	}
	public void removeCustomer(Customer c)
	{
		for(int i=0;i<totalCount;i++)
		{
			if (customer[i]==c)
			{
				
				System.out.println("	This Customer removed successfully");
				customer[i]=customer[--totalCount];
				c.show();
				System.out.println("");
			}
			else
			{
				System.out.println("	Failed! Not removed");
			}
		}
	}
	
	public void showCustomer()
	{
		
		for(int i=0;i<totalCount;i++)
		{
			if(customer[i]!=null)
			{
				System.out.println("	Name of Supershop: "+name);
				customer[i].show();
			}
		}
	}
	public void addEmployee(Employee e)
	{
		if(totalCount<employee.length)
		{
			employee[totalCount]=e;
			totalCount++;
			System.out.println("	This Employee added successfully");
			e.show();
		}
		else
		{
			System.out.println("	Failed! Not added");
		}
	}
	public void removeEmployee(Employee e)
	{
		for(int i=0;i<totalCount;i++)
		{
			if (employee[i]==e)
			{
				
				System.out.println("	This Employee removed successfully");
				employee[i]=employee[--totalCount];
				e.show();
				System.out.println("");
			}
			else
			{
				System.out.println("	Failed! Not removed");
			}
		}
	}
	
	public void showEmployee()
	{
		
		for(int i=0;i<totalCount;i++)
		{
			if(employee[i]!=null)
			{
			System.out.println("	Name of Supershop: "+name);
				employee[i].show();
			}
		}
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
			System.out.println("	Storage full");
		}
	}
	public void removeProduct(Product ob)
	{
		for(int i=0;i<totalCount;i++)
		{
			if(p[i]==ob)
			{
				p[i] = null;
				System.out.println("	Removed");
			}
			else
			{
				System.out.println("	Not Removed");
			}
		}
	}
	public Product searchProduct(int pId)
	{
		Product pd=null;
		int flag = 0;
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
			{
				if(p[i].getPID()==pId)
				{
					pd=p[i];
					flag=1;
					break;
				}
			}
		}
	    if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		return pd;
	}
	public void showProduct()
	{
		System.out.println("");
	
		
		for(int i=0;i<totalCount;i++)
		{
			if(p[i]!=null)
			{
				System.out.println("	Name: "+name);
				p[i].show();
			}	
		}
	}
	
}