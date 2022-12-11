package oppsconceptspakage;

public class childrenclass extends fatherclass {
	void m1()
	{
		this.sub();
		this.c=40;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		childrenclass obj =new childrenclass();
		obj.print();
		obj.addition();
		obj.m1();
		
		

	}

}
