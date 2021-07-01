package claim;

public abstract class Person {
	
public abstract double taxes(double amount);

public double calculateTelePhoneBill(double amount){
return this.taxes(amount) + amount;


}
}