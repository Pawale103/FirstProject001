package encapsulation;

public class encapsulation1 {
	
	private double accbalance=300000.00;
	public double getAccbalance() {
		System.out.println("this is get accbalance method");
		return accbalance;
		
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
		System.out.println("this is set accbalance method");
	}

	public static void main(String[] args) {
		encapsulation1 obj =new encapsulation1();
		System.out.println(obj.accbalance);
	double	value= obj.accbalance;
	System.out.println(value);
	obj.setAccbalance(450000.00);
	System.out.println(obj.accbalance);
	obj.getAccbalance();
	System.out.println(obj.getAccbalance());
		

	}

}
