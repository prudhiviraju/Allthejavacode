package javaprograms;

public class Employee {

	
	int empid=25445;
	double sal=25445.6;
	String name ="prudhvi R@zz";
	
}


class objectdemo{
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		objectdemo od = new objectdemo();
		od.display(e1);
		
		
	}
	
	
	void display(Employee e2) {
		
		System.out.println(e2.empid);
		System.out.println(e2.name);
		System.out.println(e2.sal);
		
	}
	
}