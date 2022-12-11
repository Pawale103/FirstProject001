package firstjavapakage;

public class nestedifelse {

	public static void main(String[] args) {
		String username1="patil";
		String username2="kale";
		String username3="shinde";
		String password="patil123";
		if (username1=="patil" || username2=="kale" || username3=="shinde" )
		{
			if (password=="patil123")
			{
				System.out.println("user is valid ");
			}
			else
			{
				System.out.println("user is invalid");	
			}
	    }
		else
		{
			System.out.println("the outer if is invalid");
		}
	}

}
