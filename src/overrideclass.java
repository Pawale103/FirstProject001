class child extends overrideclass
{
	@Override
	void marriage(){
		{
			System.out.println("Love marriage");
		}
	}
	@Override
	void parentmethod()
	{
		System.out.println("this is the over ridden method in child class");
	}
	void childproperty()
	{
		System.out.println("this is child property");
	}
}


public class overrideclass {
	void marriage()
	{
		System.out.println("arrange marriage");
	}
	
	void parentmethod()
	{
		System.out.println("this is parent method");
	}
	
	void parentproperty()
	{
		System.out.println("this is parent property");
	}
	
	
	

	public static void main(String[] args) {
		
    overrideclass obj1=new overrideclass();
    obj1.parentmethod();
    obj1.parentproperty();
    
    child obj2=new child();
    obj2.parentmethod();
    obj2.childproperty();
    obj2.marriage();
		
		
		
	}

}
