package claim;

public class Applications {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		double telPhoneBill = s1.calculateTelePhoneBill(120.5);
		
		System.out.println(telPhoneBill);
		
		
		Employee e1 = new Employee();
		
		double telPhoneBill2 = e1.calculateTelePhoneBill(120.5);
		
		System.out.println(telPhoneBill2);
		
		Person p1 = new Student();
		
		Person p2 = new Employee();
		
		

	}

}
