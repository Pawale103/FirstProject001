package oppsconceptspakage;

public class child1 extends parent{
static void play()
	{
		System.out.println("this is child play method");
	}

	public static void main(String[] args) {
		child1 obj =new child1();
		obj.test();
		play();
		parent.play();
		

	}

}
