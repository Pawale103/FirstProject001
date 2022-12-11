package oppsconceptspakage;

final public class finalkeyword {
	//final keyword is used for the final declaration of variable or method after that we can not change the value of variable or method body
    //we can not override the final method but we can overload the final method.
	//we cannot extends the final class or we cannot inherit the final class or we can not acquire the properties of that particular class.
   final int a=20;
   final void test()
   {
	   System.out.println("this is test method ");
   }
	
 final  void print()
   {
	   System.out.println("this is print method");
   }
final void print(int a)
 {
	 System.out.println("this is print method with one parameter");
 }
   
	public static void main(String[] args) {
		finalkeyword obj=new finalkeyword();
		obj.test();
		obj.print();
		System.out.println(obj.a);
		obj.print(10);
	
		

	}

}
