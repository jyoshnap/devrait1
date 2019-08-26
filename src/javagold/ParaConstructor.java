package javagold;

public class ParaConstructor {

	String name;
	int id;
	int age;
	
	ParaConstructor(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	ParaConstructor(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println(id + name + age);
	}
	public static void main(String[] args) {
		ParaConstructor p1 = new ParaConstructor(15,"sree",22);
		ParaConstructor p2 = new ParaConstructor(15,"sree");
		
		p1.display();
		p2.display();
		
		
		
		
		

	}

}
