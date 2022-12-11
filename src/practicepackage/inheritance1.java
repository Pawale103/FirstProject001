package practicepackage;

class parent {
	
	void print()
	{
		System.out.println("this is parent method ");
	}
	
}

class child extends parent{
	@Override
	void print()
	{
		System.out.println("this is print method in child class");
	}
	
}

public class inheritance1 {

	public static void main(String[] args) {
		
		child obj= new child();
		obj.print();
		

	}

}
