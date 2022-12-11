package oppsconceptspakage;

public class conconcept {
	String name;
	int deptno;
	
	conconcept()//constructor is used for initializing class instance variable.
	{
		System.out.println("this is constructor");
    }
	conconcept(String ename,int edeptno)
	{
		name=ename;
		deptno=edeptno;
		System.out.println(ename);
		System.out.println(edeptno);
		System.out.println("this is parameterized constructor");
		
		
	}

	public static void main(String[] args) {
		conconcept obj =new conconcept();
		new conconcept("john",10);
		
		

	}

}
