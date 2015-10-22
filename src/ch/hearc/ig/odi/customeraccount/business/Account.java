package ch.hearc.ig.odi.customeraccount.business;

public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String number, String name, double rate, Customer customer) {
		this.number = number;
                this.name = name;
                this.rate = rate;
                this.customer = customer;
	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
            if (amount>0) {
                this.balance = this.balance + amount;
            } else {
                System.out.println("Montant inférieur ou égal à 0.");
            }
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
            if ((amount>0) && (amount<=this.balance)) {
                this.balance = this.balance - amount;
            } else if(amount<=this.balance){
                System.out.println("Montant non disponible sur le compte");
            } else{
                System.out.println("Montant inférieur ou égal à 0.");
            }
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfer(double amount, Account source, Account target) {
		source.debit(amount);
                target.credit(amount);
	}

}