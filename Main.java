import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int numb = 1;
		int choice1;
		int addProduct;
		String ID;
		int Pass;
		//do{
		System.out.println("					T3S SuperShop");
		System.out.println("			Zomoz Road,Zoar Sahara,Vatara ,Dhaka,Bangladesh\n");
		System.out.println("	1.Admin");
		System.out.println("	2.User");
		System.out.print("\n	Enter 1 for ADMIN & Enter 2 for USER = ");
		int ii = sc.nextInt();
		numb=ii;
		
		if(numb==1)
		{
			
			System.out.print("	Enter Admin ID: ");
			Scanner ad = new Scanner(System.in);
			ID = ad.nextLine();
			
			System.out.print("	Enter Admin Password: ");
			Scanner ad1 = new Scanner(System.in);
			
			Pass = ad1.nextInt();
			
			if (ID.equals("Admin")&&Pass==1234)
			{
				//ReadUserInfo.UserInfo();
			
			System.out.println("==========Welcome Admin===========");
				System.out.println("      1. Product Management");
				System.out.println("      2. Customer Management");
				System.out.println("      3. Employee Management");
				choice1 = sc.nextInt();
				Supershop s=new Supershop("T3S",50000,50,1230000);
				Product p = new Product();
				if (choice1 ==1)
				{
					System.out.println("==========Add a new product===========");
					System.out.println("==========Remove a product=============");
			        System.out.println(" 	Press 1 to add Product");
                    System.out.println("	 Press 2 to remove Product....");					
			        addProduct = ad1.nextInt(); 
					if(addProduct==1)
					{
						
						System.out.println("===========Add a new product===========");
				
			
				System.out.println("	ID: ");
				p.setPID(ad1.nextInt());
				
				System.out.println("	Name of Product: ");  
				String pName = ad1.next();
				p.setName(pName); 

				System.out.println("	price: ");  
				p.setPrice(ad1.nextDouble()) ; 	
				
				System.out.println("	Availavle Quantity: ");  
				p.setAvaiavleQuantity(ad1.nextDouble()) ; 	
				
				System.out.println("	Category: ");  
				p.setCategory(ad1.next()); 	
				p.show();
				s.addProduct(p);
						
				}
				else if(addProduct==2)
				{
					s.removeProduct(p);
				}
				else
				{
					
				}
					
				}
			
				System.out.println("============Add new Customer==========");
				
				Customer c = new Customer();
				System.out.print("	Name: ");
				c.setname(ad1.nextLine());
				System.out.print("	ContactNumber: ");
				c.setContactNumber(ad1.nextLine());
				System.out.print("	Age: ");  
				c.setage(ad1.nextInt());
				System.out.print("	Address :"); 
				c.setAddress(ad1.next());
				s.addCustomer(c);
				c.show();
				
				
				
				System.out.println("=========Add new Employee=========");
				
				Employee e = new Employee();
				
				System.out.print("	Name: ");
				e.setname(ad1.next());
				System.out.print("	ContactNumber: ");
				e.setContactNumber(ad1.next());
				System.out.print("	Age: ");  
				e.setage(ad1.nextInt());
				System.out.print("	ID: ");
				e.setId(ad1.nextLine());
				System.out.print("	Salary: ");
				e.setSalary(ad1.nextDouble());
				s.addEmployee(e);
				e.show();
				
			
			}
			else
			{
				System.out.print("	Wrong ID or Password! Please Try Again");
			}
		}
		//}while(i<2);
				
		else if(numb==2)
		{
			while(numb>0){
			System.out.print("	Enter Your Name as User ID: ");
			
			Scanner ad = new Scanner(System.in);
			ID = ad.nextLine();
			ID.toLowerCase();
			
			
			
			System.out.print("	Enter User Last 4 digit of Your mobile Number as Password: ");
			Scanner ad1 = new Scanner(System.in);
			Pass = ad1.nextInt();
			Customer c1=new Customer("Jobaer","01796767714",20,"Vatara");
			Customer c2=new Customer("Hossain","01796767701",20,"Zoar Sahara");
			Customer c3=new Customer("Tuhin","01796767702",20,"Khilkhet");
			Customer c4=new Customer("Saymon","01796767703",20,"Uttara");
			Customer c5=new Customer("Asaduzzaman","01796767705",20,"Kuratoli");
			Customer c6=new Customer("Samin","01796767706",20,"Kuril");
			Customer c7=new Customer("Shayan","01796767707",20,"Banani");
			Customer c8=new Customer("Abrar","01796767708",20,"Badda");
			if (ID.equals("jobaer")&&Pass==7714 || ID.equals("hossain")&&Pass==7701 || ID.equals("tuhin")&&Pass==7702 || ID.equals("asaduzzaman")&&Pass==7705 || ID.equals("samin")&&Pass==7706 || ID.equals("shayan")&&Pass==7707 || ID.equals("abrar")&&Pass==7708)
			{
				System.out.println("	\n			Welcome To T3S SuperShop");
				
			
		
			
			
		
		Scanner sin=new Scanner (System.in);
		int no;
		int pNo;
		int cNo;
		

        
		System.out.println("\n==========Products Category============");
		System.out.println("	1.Grocery\n	2.Food\n	3.Books & Stationary\n	4.Health\n	5.Pet Care Zone\n	6.Cosmetics \n	7.Sports Accesories \n	8.Fashion\n");
		System.out.print("	Press the serial number for your desired Category: ");
		cNo=sin.nextInt();
		
		if(cNo==1)
		{
			System.out.println("\n=======Grocery Item========");
			System.out.println("	1.Grains & bread \n	2.condiments \n	3. herbs & spices \n	4.dairy& eggs \n	5.oil & fat\n");
			System.out.print("Press the serial number for your desired products");
			no=sin.nextInt();
			Grocery g=new Grocery();
		
			if(no==1)
			{
				System.out.println("\n=======Grains & Bread=======");
				System.out.println("	1.Pasta \n	2.Rice \n	3.Bread\n ");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					g.Grains_bread("Pasta",20,200);
				}
				else if(pNo==2)
				{
					g.Grains_bread("RICE",80,300);
				}
				else if(pNo==3)
				{
					g.Grains_bread("Bread",90,300);
				}
			}
			else if (no==2)
			{
				System.out.println("\n=======Condiments=======");
				System.out.println("	1.Salt \n	2.Pepper \n	3.Stock cubes \n	4.Honey \n	5.Vinegar \n	6.Sugar\n");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					g.condiments("Salt",15);
				}
				else if(pNo==2)
				{
					g.condiments("pepper",30);
				}
				else if(pNo==3)
				{
					g.condiments("Stock cubes",50);
				}
				else if(pNo==4)
				{
					g.condiments("Honey",80);
				}
				else if(pNo==5)
				{
					g.condiments("Vinegar",60);
				}
				else if(pNo==6)
				{
					g.condiments("Sugar",30);
				}
				
			}
			else if(no==3)
			{
				System.out.println("\n=======herbs & spices=======");
				System.out.println("	1.Basil \n	2.	Oregano \n	3.Coriander \n	4.Cumin\n ");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					g.herbs_spices("Basil",120);
				}
				else if(pNo==2)
				{
					g.herbs_spices("Oregano",90);
				}
				else if(pNo==3)
				{
					g.herbs_spices("Coriander",150);
				}
				else if(pNo==4)
				{
					g.herbs_spices("Cumin",100);
				}
			}
			else if(no==4)
			{
				System.out.println("\n=======dairy& eggs=======");
				System.out.println("	1.Milk \n	2.	Egges \n	3.Cheese \n	4.Yogurt\n ");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					g.dairy_eggs("Milk",80);
				}
				else if(pNo==2)
				{
					g.dairy_eggs("Egges",50);
				}
				else if(pNo==3)
				{
					g.dairy_eggs("Cheese",150);
				}
				else if(pNo==4)
				{
					g.dairy_eggs("Yogurt",110);
				}
			}
			else if(no==5)
			{
				System.out.println("\n=======Oil & Fat=======");
				System.out.println("	1.Mustard oil \n	2.Butter\n  3.Soyabean Oil\n	4.Ricebrun Oil\n");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					g.oil_fat("Mustard oil",300);
				}
				else if(pNo==2)
				{
					g.oil_fat("Butter",350);
				}
				else if(pNo==3)
				{
					g.oil_fat("Soyabean Oil",190);
				}
				else if(pNo==4)
				{
					g.oil_fat("Ricebrun Oil",250);
				}
			}		
		}
		else if(cNo==2)
		{
			System.out.println("\n==========Foood Item========");
			System.out.println("	1.Fresh Vegetables & Fruits \n	2.Snacks & Soft Drinks \n	3.Meat & Fish\n");
			System.out.print("Press the serial number for your desired products: ");
			no=sin.nextInt();
			Food f=new Food();
		
			if(no==1)
			{
				System.out.println("\n=======Vegetables & Fruits=======");
				System.out.println("	1.Potato \n	2.Tomato \n	3.Green Chilli \n	4.Cucumber \n	5.Capsicum \n	6.Onion \n	7.Radish \n	8.Carrot \n	9.Mushroom \n	10.Corn \n	11.Apple \n	12.Orange \n	13.Guava \n	14.Banana\n 	15.Dragon Fruits\n");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					f.food("Potato",20,200,"Vegetable","Bogra");
					f.show();
				}
				else if(pNo==2)
				{
					f.food("Tomato",80,300,"Vegetable & Fruir","Mymensing");
					f.show();
				}
				else if(pNo==3)
				{
					f.food("Green Chilli",120,10,"Vegetable","Gaibandha");
					f.show();
				}
				else if(pNo==4)
				{
					f.food("Cucumber",70,40,"Vegetable","Dhaka");
					f.show();
				}
				else if(pNo==5)
				{
					f.food("Capsicum",150,5,"Vegetable","Jhalokathi");
					f.show();
				}
				else if(pNo==6)
				{
					f.food("Onion",60,20,"Vegetable","Pabna");
					f.show();
				}
				else if(pNo==7)
				{
					f.food("Radish",60,30,"Vegetable","Rangpur");
					f.show();
				}
				else if(pNo==8)
				{
					f.food("Carrot",40,40,"Vegetable","Rajbari");
					f.show();
				}
				else if(pNo==9)
				{
					f.food("Mushroom",200,10,"Vegetable","Ashulia");
					f.show();
				}
				else if(pNo==10)
				{
					f.food("Corn",80,10,"Fruit","Dinajpur");
					f.show();
				}
				else if(pNo==11)
				{
					f.food("Apple",200,30,"Fruit","Kashmir,India");
					f.show();
				}
				else if(pNo==12)
				{
					f.food("Orange",150,20,"Fruit","Kashmir,Pakistan");
					f.show();
				}
				else if(pNo==13)
				{
					f.food("Guava",65,40,"Fruit","Barishal");
					f.show();
				}
				else if(pNo==14)
				{
					f.food("Banana",40,20,"Fruit","Noakhali");
					f.show();
				}
				else if(pNo==15)
				{
					f.food("Dragon Fruit",300,20,"Fruit","Gazipur");
					f.show();
				}
			}
			else if (no==2)
			{
				System.out.println("\n==========Snacks & Soft Drinks========");
				System.out.println("	1.Potato Chips \n	2.Tomato Masala Chips \n	3.Chilli Chanachur \n	4.Flattened Rice \n	5.Puffed Rice \n	6.Bbq Chanachur\n	7.Sweets Chanachur \n	8.Dal vaja \n	9.Lexus Vegetable Biscuit \n	10.Chocolate Cream Buiscuit \n	11.Potato Spicy Biscuit \n	12.Orange Flavour Biscuit \n	13.Toast Biscuit \n	14.Vanilla Biscuit\n");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					f.food("Potato Chips",15,300,"Snacks","Bangladeshi");
					f.show();
				}
				else if(pNo==2)
				{
					f.food("Tomato Masala Chips",15,300,"Snacks","Bangladeshi");
					f.show();
				}
				else if(pNo==3)
				{
					f.food("Chilli Chanachur",45,400,"Snacks","Indian");
					f.show();
				}
				else if(pNo==4)
				{
					f.food("Flattened Rice",355,300,"Snacks","Bangladeshi");
					f.show();
				}
				else if(pNo==5)
				{
					f.food("Puffed Rice",20,300,"Snacks","Thai");
					f.show();
				}
				else if(pNo==6)
				{
					f.food("BBQ Chanachur",60,300,"Chanachur","Srilankan");
					f.show();
				}
				else if(pNo==7)
				{
					f.food("Sweet Chanachur",15,300,"Chanachur","Bangladesh");
					f.show();
				}
				else if(pNo==8)
				{
					f.food("Dal vaja",15,300,"Snacks","Bangladesh");
					f.show();
				}
				else if(pNo==9)
				{
					f.food("Lexus Vegetable Biscuit",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				else if(pNo==10)
				{
					f.food("Chocolate Cream Buiscuit",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				else if(pNo==11)
				{
					f.food("Potato Spicy Biscuit",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				else if(pNo==12)
				{
					f.food("Orange Flavour Biscuit",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				else if(pNo==13)
				{
					f.food("Potato Chips",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				else if(pNo==14)
				{
					f.food("Vanilla Biscuit",15,300,"Biscuit","Bangladesh");
					f.show();
				}
				
				
			}
			else if (no==3)
			{
				System.out.println("\n==========Meat & Fish========");
				System.out.println("	1.Chicken \n	2.Beef \n	3.Mutton \n	4.Hilsha(Padma) \n	5.Hilsha(Bay Of Bengal) \n	6.Tuna Fish\n	7.Tilapia \n	8.Shrimp(Golda) \n	9.Shrimp(Desi) \n	10.Rui \n	11.Katla \n");
				System.out.print("Enter your Product Number: ");
				pNo=sin.nextInt();
				if(pNo==1)
				{
					f.meat("Chicken",600,300,"Meat",2);
					f.showMeat();
				}
				else if(pNo==2)
				{
					f.meat("Beaef",1000,300,"Meat",1.5);
					f.showMeat();
				}
				else if(pNo==3)
				{
					f.meat("Mutton",800,300,"Meat",1);
					f.showMeat();
				}
				else if(pNo==4)
				{
					f.meat("Hilsha(Padma)",1500,300,"Fish",1);
					f.showMeat();
				}
				else if(pNo==5)
				{
					f.meat("Hilsha(Bay Of Bengal)",1200,300,"Sea Fish",1);
					f.showMeat();
				}
				else if(pNo==6)
				{
					f.meat("Tuna Fish",500,300,"Sea Fish",1);
					f.showMeat();
				}
				else if(pNo==7)
				{
					f.meat("Tilapia",150,300,"Fish",1);
					f.showMeat();
				}
				else if(pNo==8)
				{
					f.meat("Shrimp(Golda)",800,300,"Fish",1);
					f.showMeat();
				}
				else if(pNo==9)
				{
					f.meat("Shrimp(Desi)",1.5,300,"Fish",600);
					f.showMeat();
				}
				else if(pNo==10)
				{
					f.meat("Rui",300,300,"Fish",1);
					f.showMeat();
				}
				else if(pNo==11)
				{
					f.meat("Katla",500,300,"fish",1.5);
					f.showMeat();
				}
			}
				
		}
		else if(cNo==3)
		{
			System.out.println("\n==========BOOKS AND STATIONERY============");
	
		System.out.println("1.Stationary Items \n2.Books \n3.Office Supplies");
		System.out.print("Press the serial number for your desired products");
		no=sin.nextInt();
		
		
	
		Stationary s=new Stationary();
		
		if(no==1)
		{
			System.out.println("\n=====Stationery Items=====");
			System.out.println("1.Pen \n2.Gel Pen \n3.Scale \n4.Eraser \n5.Sharpner \n6.Pencils \n7.Colour Pencils \n8.Lead Pencils\n9.Spare Lead Box \n10.Crayon Colours \n11.Water Colours \n12.Water Colour Brushes \n13.Highlighter \n14.Drawing Papers \n15.Notebooks ");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
		
			{
				s.stationary_Items("Pen",10,500);
			}
			else if(pNo==2)
			{
				s.stationary_Items("Gel Pen",25,300);
			}
			else if(pNo==3)
			{
				s.stationary_Items("Scale",15,250);
			}
			else if(pNo==4)
			{
				s.stationary_Items("Eraser",5,850);
			}
			else if(pNo==5)
			{
				s.stationary_Items("Sharpner",5,680);
			}
			else if(pNo==6)
			{
				s.stationary_Items("Pencils",10,300);
			}
			else if(pNo==7)
			{
				s.stationary_Items("Colour Pencils",25,240);
			}
			else if(pNo==8)
			{
				s.stationary_Items("Lead Pencil",30,100);
			}
			else if(pNo==9)
			{
				s.stationary_Items("Spare Lead Box",15,35);
			}
			else if(pNo==10)
			{
				s.stationary_Items("Crayon Colours",50,140);
			}
			else if(pNo==11)
			{
				s.stationary_Items("Water Colours",120,60);
			}
			else if(pNo==12)
			{
				s.stationary_Items("Water Colour Brush",12,120);
			}
			else if(pNo==13)
			{
				s.stationary_Items("Highlighter",35,300);
			}
			else if(pNo==14)
			{
				s.stationary_Items("Drawing Papers",5,1200);
			}
			else if(pNo==15)
			{
				s.stationary_Items("Notebooks",35,800);
			}
		}
		
		else if (no==2)
		{
		    System.out.println("\n=====Books=====");
			System.out.println("1.Children Books \n2.Non fiction Story Books \n3.Fiction Story Book \n4.Motivational Books \n5.History Books \n6.Science Fiction Books \n7.NCTB Books");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
				s.books("Children Books",200,15);
			}
			else if(pNo==2)
			{
				s.books("Non Fiction Story Books",350,22);
			}
			else if(pNo==3)
			{
				s.books("Fiction Story Books",350,25);
			}
			else if(pNo==4)
			{
				s.books("Motivational Books",150,30);
			}
			else if(pNo==5)
			{
				s.books("History Books",300,28);
			}
			else if(pNo==6)
			{
				s.books("Science Fiction Books",480,30);
			}
			else if(pNo==7)
			{
				s.books("NCTB Books",200,120);
			}
		}
		else if(no==3)
		{			
		    System.out.println("\n=====Office Supplies=====");
			System.out.println("1.Files \n2.Clipboard \n3.Binder Clips \n4.Paper Clips \n5.File Organizer bag \n6.A4 Size papers \n7.A3 Size papers \n8.Photocopy Toner Tube (Black) \n9.Photocopy Toner Tube (Multicolour)");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
				s.office_Supplies("Files",15,350);
			}
			else if(pNo==2)
			{
				s.office_Supplies("Clipboard",50,150);
			}
			else if(pNo==3)
			{
				s.office_Supplies("Binder Clips",20,560);
			}
			else if(pNo==4)
			{
				s.office_Supplies("Paper Clips",2,1200);
			}
			else if(pNo==5)
			{
				s.office_Supplies("File Organizer bag",70,23);
			}
			else if(pNo==6)
			{
				s.office_Supplies("A4 Size paper",2,5000);
			}
			else if(pNo==7)
			{
				s.office_Supplies("A3 Size paper",2,2500);
			}
			else if(pNo==8)
			{
				s.office_Supplies("Photocopy Toner Tube (Black)",50,16);
			}
			else if(pNo==9)
			{
				s.office_Supplies("Photocopy Toner Tube (Multicolour)",70,7);
			}
		}	
		}	
		else if(cNo==4)
		{
			System.out.println("Health Supplies....");
	
		System.out.println("1.Medicines \n2.First Aids");
		System.out.print("Press the serial number for your desired products : ");
		no=sin.nextInt();
		
	
		Health h=new Health();
		
		if(no==1)
		{
			System.out.println("\n=======Medicines=======");
			System.out.println("1.Paracetamol \n2.Omeprazol \n3.Calcium+ \n4.Napa 500 \n5.Napa Extend \n6.Multivitamins");
			System.out.print("Enter your Product Number : ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
		
				h.medicine("Paracetamol",20,200);
			}
			else if(pNo==2)
			{
				h.medicine("Omeprazol",10,300);
			}
			else if (pNo == 3)
			{
				h.medicine("Calcium+", 30,200);
		    }
			else if (pNo == 4)
			{
				h.medicine("Napa 500", 20,200);
		    }
			else if (pNo == 5)
			{
				
				h.medicine("Napa Extend", 30,200);
		    }
			else if (pNo == 6)
			{
				h.medicine("Multivitamins", 30,200);
		    }
			else  
			{
		     System.out.println("InValid Input");
		    }
		}
		
		
		else if (no==2)
		{
		    System.out.println("\n=======First Aid=======");
			System.out.println("1.Bandage \n2.Viodin \n3.Haxisol");
			System.out.print("Enter your Product Number : ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
				h.firstAid("Bandage",5, 200);
			}
			if(pNo==2)
			{
				h.firstAid("Viodin",150, 200);
			}
			if(pNo==3)
			{
				h.firstAid("Haxisol",150, 200);
			}
		}	
		}
		else if(cNo==5)
		{
			System.out.println("\n===========Pet Care Zone==========");
			System.out.println("	1.Kitten Chicken	\n2.Lamb	\n3.Chicken & Fish	\n4.Kitten & Mother Care Lamb	\n5.Digest Care chicken		\n6.Friskies Seafood	\n7.Meaty Grills	\n8.Kitten Discoveries");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			Petcare p=new Petcare();
			if(pNo==1)
			{
				p.pet("Kitten Chicken",280,500,"Pet Food",1.5);
			}
			else if(pNo==2)
			{
				p.pet("Lamb",420,100,"Pet Food",1);
			}
			else if(pNo==3)
			{
				p.pet("Chicken & Fish",360,400,"Pet Food",0.5);
			}
			else if(pNo==4)
			{
				p.pet("Kitten & Mother Care Lamb",1250,200,"Pet Food",2);
			}
			else if(pNo==5)
			{
				p.pet("Digest Care chicken",1300,500,"Pet Food",1.5);
			}
			else if(pNo==6)
			{
				p.pet("Friskies Seafood",280,500,"Oet Food",0.45);
			}
			else if(pNo==7)
			{
				p.pet("Meaty Grills",220,500,"Pet Food",0.45);
			}
			else if(pNo==8)
			{
				p.pet("Kitten Discoveries",620,500,"Pet Food",1.1);
			}
		}
		else if(cNo==6)
		{
		System.out.println("\n================Cosmetics Item=============");
		System.out.println("1.Lipstick   \n2.Eye shadow   \n3.Blusher   \n4.Eye liner   \n5.Concealer    \n6.Foundation   \n7.Nail polish   \n8.Primer   \n9.Kajal   \n10.Face powder");
		System.out.print("Enter your Product Number: ");
		pNo=sin.nextInt();
		Cosmetics c=new Cosmetics();
		if(pNo==1)
		{
			c.makeup("Lipstick",499,300);
		}
		else if(pNo==2)
		{
			c.makeup("Eye Shadow",399,300);
		}
		else if(pNo==3)
		{
			c.makeup("Blusher",450,300);
		}
		else if(pNo==4)
		{
			c.makeup("Eye Liner",499,300);
		}
		else if(pNo==5)
		{
			c.makeup("Concealer",299,200);
		}
		else if(pNo==6)
		{
			c.makeup("Foundation",199,100);
		}
		else if(pNo==7)
		{
			c.makeup("Nail Polish",150,200);
		}
		else if(pNo==8)
		{
			c.makeup("Primeer",239,200);
		}
		else if(pNo==9)
		{
			c.makeup("Kajal",699,300);
		}
		else if(pNo==10)
		{
			c.makeup("Fac Powder",1499,120);
		}
		}
		else if(cNo==7)
		{
		System.out.println(".........Sports Items.........");
		System.out.println("1.GymEquipmnts \n2.SportsEquipmts \n3.SportsWear");
		System.out.print("Press the serial number for your desired products : ");
		no=sin.nextInt();
		
		SportsP s= new SportsP();
		
		
		if(no == 1)
		{
			System.out.println("============Gym Equipments========");
			System.out.println("1.Biceps Curl \n2.Super Squat \n3.Smith Machine \n4.Leg Press \n5.Cable Crossover \n6.Treadmills \n7.Walking Pad \n8.Exercise Cycle");
			System.out.print("Enter your Product Number : ");
			pNo=sin.nextInt();
			
			if(pNo == 1)
			{
				s.gymEquipmnts("Biceps Curl", 2750,30);
			}
			else if(pNo == 2)
			{
				s.gymEquipmnts("Super Squat", 20000,18);
			}
			else if(pNo == 3)
			{
				s.gymEquipmnts("Smith Machine", 25000,15);
			}
			else if(pNo == 4)
			{
				s.gymEquipmnts("Leg Press",50000,14);
			}
			else if(pNo == 5)
			{
				s.gymEquipmnts("Cable Crossover",140000,10);
			}
			else if(pNo == 6)
			{
				s.gymEquipmnts("Treadmills",76556,17);
			}
			else if(pNo == 7)
			{
				s.gymEquipmnts("Walking Pad",60000,20);
			}
			else if(pNo == 8)
			{
				s.gymEquipmnts("Exercise Cycle",9500,35);
			}
		}
		
		
		else if(no==2)
		{
		    System.out.println("============Sports Equipments============");
			System.out.println("1.Cricket Bat & Ball \n2.Football \n3.Badminton Bat and Feather \n4.Busket Ball \n5.Hockey Ball & Bat \n6.Golf Ball & Bat \n7.Table Tennis \n8.Pool Table");
			System.out.print("Enter your Product Number : ");
			pNo=sin.nextInt();
			if(pNo == 1)
			{
				s.sportsEquipmts("Cricket Bat & Ball",2000,200);
			}
			else if(pNo == 2)
			{
				s.sportsEquipmts("Football",3000,200);
			}
			else if(pNo == 3)
			{
				s.sportsEquipmts("Badminton Bat and Feather",4000,200);
			}
			else if(pNo == 4)
			{
				s.sportsEquipmts("Busket Ball",1500,200);
			}
			else if(pNo == 5)
			{
				s.sportsEquipmts("Hockey Ball & Bat",2100,200);
			}
			else if(pNo == 6)
			{
				s.sportsEquipmts("Golf Ball & Bat",1500,200);
			}
			else if(pNo == 7)
			{
				s.sportsEquipmts("Table Tennis",5000,170);
			}
			else if(pNo == 8)
			{
				s.sportsEquipmts("Pool",380000,10);
			}
			
		}	
	
	
	
	else if(no==3)
		{
		    System.out.println("===========Sports Wear=========");
			System.out.println("1.Sports Shoes \n2.Sports Jersey \n3.Long Shorts \n4.Socks \n5.Sports Trouser \n6.Training Jacket \n7.Exercise Outfit \n8.Track Suit");
			System.out.print("Enter your Product Number : ");
			pNo=sin.nextInt();
			if(pNo == 1)
			{
				s.sportsWear("Sports Shoes",4500,200);
			}
			else if(pNo == 2)
			{
				s.sportsWear("Sports Jersey",3000,200);
			}
			else if(pNo == 3)
			{
				s.sportsWear("Long Shorts",600,200);
			}
			else if(pNo == 4)
			{
				s.sportsWear("Socks",150,200);
			}
			else if(pNo == 5)
			{
				s.sportsWear("Sports Trouser",600,200);
			}
			else if(pNo == 6)
			{
				s.sportsWear("Training Jacket",5000,200);
			}
			else if(pNo == 7)
			{
				s.sportsWear("Exercise Outfit",5990,170);
			}
			else if(pNo == 8)
			{
				s.sportsWear("Track Suit",1690,10);
			}
		}
		}
		else if(cNo==8)
		{
			System.out.println("==========Fashion Item===========");
	
		System.out.println("	1.Male Fashion \n	2.Female Fashion \n	3.Kids Fashion");
		System.out.print("Press the serial number for your desired products: ");
		no=sin.nextInt();
		
	
		Fashion f=new Fashion();
		
		if(no==1)
		{
			System.out.println("=======Male Fashion=======");
			System.out.println("	1.Sweater \n	2.Shirt \n	3.Jeans \n	4.Gloves \n	5.Cap \n	6.Suit \n	7.Hawaiian shirt \n	8.Singlet \n	9.Business shoes \n	10.Flip flops \n	11.Shorts \n	12.Cardigan \n	13.Jacket \n	14.Sport shoes \n	15.Bow tie \n	16.Sleeveless shirt \n	17.Vest \n	18.Long-sleeve top \n	19.Jumper \n	20.Trench coat \n	21.Bathrobe \n	22.Cargo pants \n	25.Swimsuit \n	26.Blazer \n	27.T-shirt ");
			System.out.println("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
		
				f.fashion("Sweater",2000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==2)
			{
				f.fashion("Shirt",1200,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==3)
			{
				f.fashion("Jeans",800,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==4)
			{
				f.fashion("Gloves",150,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==5)
			{
				f.fashion("Cap",500,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==6)
			{
				f.fashion("Suit",6000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==7)
			{
				f.fashion("Hawaiian shirt",600,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==8)
			{
				f.fashion("Singlet",400,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==9)
			{
				f.fashion("Business shoes",3000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==10)
			{
				f.fashion("Flip flops",800,"Male Fashion",20,"L");
				f.show();
			}
				else if(pNo==11)
			{
				f.fashion("Shorts",1000,"Male Fashion",20,"L");
				f.show();
			}
				else if(pNo==12)
			{
				f.fashion("Cardigan",1500,"Male Fashion",20,"L");
				f.show();
			}
				else if(pNo==13)
			{
				f.fashion("Jacket",6500,"Male Fashion",20,"L");
				f.show();
			}
				else if(pNo==14)
			{
				f.fashion("Sport shoes",1500,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==15)
			{
				f.fashion("Bow tie",200,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==16)
			{
				f.fashion("Sleeveless shirt",600,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==17)
			{
				f.fashion("Vest",500,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==18)
			{
				f.fashion("Long-sleeve top",400,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==19)
			{
				f.fashion("Jumper",1200,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==20)
			{
				f.fashion("Trench coat",4000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==21)
			{
				f.fashion("Bathrobe",400,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==22)
			{
				f.fashion("Cargo pants",800,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==23)
			{
				f.fashion("Swimsuit",4000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==24)
			{
				f.fashion("Blazer",7000,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==25)
			{
				f.fashion("T-shirt",1200,"Male Fashion",20,"L");
				f.show();
			}
			else if(pNo==00)
			{
				break;
			}
		}
		else if (no==2)
		{
			System.out.println("=======Female Fashion=======");
			System.out.println("	1.T-shirt \n	2.Sheath dress \n	3.Long-sleeve top \n	4.Skirt \n	5.Thong \n	6.Hat \n	7.High-heeled shoes \n	8.Necklace \n	9.Ring \n	10.Earrings \n	11.Handbag \n	12.Bracelet \n	13.Purse \n	14.Scarf");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
				f.fashion("T-shirt",2000,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==2)
			{
				f.fashion("Sheath dress",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==3)
			{
				f.fashion("Long-sleeve top",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==4)
			{
				f.fashion("Skirt",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==5)
			{
				f.fashion("Thong",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==6)
			{
				f.fashion("Hat",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==7)
			{
				f.fashion("High-heeled shoes",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==8)
			{
				f.fashion("Necklace",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==9)
			{
				f.fashion("Ring",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==10)
			{
				f.fashion("Earrings",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==11)
			{
				f.fashion("Handbag",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==12)
			{
				f.fashion("Bracelet",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==13)
			{
				f.fashion("Purse",1200,"Female Fashion",20,"L");
				f.show();
			}
			else if(pNo==14)
			{
				f.fashion("Scarf",1200,"Female Fashion",20,"L");
				f.show();
			}
		}	
			else if (no==3)
		{
			System.out.println("=======Kids Fashion=======");
			System.out.println("	1.Peewee Tots \n	2.Baby Sweet \n	3.Ankle Biters Lot \n	4.The Charming Baby \n	5.Silly Baby \n	6.Hat \n	7.Mini Tikes \n	8.Baby Time \n	9.Balls n Dolls \n	10.Sunshine Cuties \n	11.Bib and Zib Kids Clothing \n	12.Spotlight on Style \n	13.Beau and Bella \n	14.Assie Style");
			System.out.print("Enter your Product Number: ");
			pNo=sin.nextInt();
			if(pNo==1)
			{
				f.fashion("Peewee Tots",2000,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==2)
			{
				f.fashion("Baby Sweet",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==3)
			{
				f.fashion("Ankle Biters Lot",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==4)
			{
				f.fashion("The Charming Baby",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==5)
			{
				f.fashion("Silly Baby",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==6)
			{
				f.fashion("Hat",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==7)
			{
				f.fashion("Mini Tikes",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==8)
			{
				f.fashion("Baby Time",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==9)
			{
				f.fashion("Balls n Dolls",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==10)
			{
				f.fashion("Sunshine Cuties",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==11)
			{
				f.fashion("Bib and Zib Kids Clothing",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==12)
			{
				f.fashion("Beau and Bella",1200,"Kids Fashion",20,"L");
				f.show();
			}
			else if(pNo==13)
			{
				f.fashion("Assie Style",1200,"Kids Fashion",20,"L");
				f.show();
			}
		}
		else if(no==00)
		{
			break;
		}
		}
		}
		
		else 
		{
			System.out.println("	Wrong ID or Password! Please Input Correct User Name and Pass");
		}
			
		}
		}
		
	}
	
}	
