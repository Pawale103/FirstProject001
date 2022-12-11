
public class classpublic {
	
	public int a=20;
	
	public int b=30;
	
	public void addition()
	{
		System.out.println(a+b);
	}
	
	public void dance()
	{
		System.out.println("this is the dance mehtod in default package");
	}
		


	public static void main(String[] args) {
		
		classpublic obj = new classpublic();
		obj.addition();
		obj.dance();
		
		
	}

}
