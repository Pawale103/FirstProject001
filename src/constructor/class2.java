package constructor;

 class class2 extends class1 {
	
	public class2()
	{
		super(10);
		System.out.println("this is child constructor in class 2");
	}

	public static void main(String[] args) {
		class2 obj= new class2();
		
		//new class2();//constructor does not follow the inheritance but By default child class constructor call the parent class constructor upon object creation.
		//if only parent class has zero argument constructor if not it will not call automatically 
		
		//by using super keyword in child constructor we can call the argument based constructor
		new class1(10);
		// inheritance is used to improve the usability of the code 
		//if We have to use only one or two methods of the class then by creating object reference variable we can use that methods 
		// but if we have to use most of the methods from any particular class then we use inheritance that is use of extends keyword to inherit property of parent class
        // if we declare any class final then we can not have child class of that particular method or we can not inherit that particular class in any class
	}
	
	// Access Modifiers applicable to class
	//public - to access the method throughout the project class and method access modifier should be public (both);
	// to access within package class & method access level should be at least default
	//we can not access the default class or default methods outside the package
	// we can access the protected methods within the package and outside the package but to access outside of the package we have to use inheritance
	//final-if we declare any class final then it can not have child class, & for final method can not be overridden 
	//default
	//abstract- use- methods which are are used to define incomplete functionality of the  application which are not clear to client
	
	// We can not create the object of abstract class so we call all the methods by creating the object of child class of abstract class is is also called as concrete class or complete class
	
	//private access modifier is not applicable to class
	// we can not use private & final access modifiers with abstract class and method
	// abstract class can contain the constructor 
	//we can call the constructor of abstract class by creating object of child class which is not abstract
	// And for argument constructor we have to call the constructor with super keyword
	
// all the methods in interface are by default public and abstract
	
	// We can extend the class and implement the interface in same class at a time (first we have to extend) 
}
