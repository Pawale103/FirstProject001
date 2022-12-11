package firstjavapakage;

public class statickeyword {
	
String name;
int deptno;
double salary;
int eid;

public void print()
{
	System.out.println("the neame of the employee is:"+name);
	System.out.println("the department no of the employee is:"+deptno);
	System.out.println("the salary of the employee is :"+salary);
	System.out.println("the employee id of the employee is :"+eid);
}

	public static void main(String[] args) {
		System.out.println("the employee no 1 data");
		statickeyword obj1 =new statickeyword();
		obj1.name="mahesh";
		obj1.deptno=1;
		obj1.salary=20000.00;
		obj1.eid=101;
		obj1.print();
				
		System.out.println("the employee no 2 data ");
		statickeyword obj2 = new statickeyword();
		obj2.name="ramesh";
		obj2.deptno=1;
		obj2.salary=30000.00;
		obj2.eid=102;
		obj2.print();
		
	}

}
