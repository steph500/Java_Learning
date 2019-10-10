
public class Goods {
	
	//String name;
	//int amount;
	
	/*
	public Goods() {
		System.out.println(name + " of amount : "+ amount + " was sold ");
	}
	*/
	
	public Goods() {
		System.out.println("Constructor running!");
	}
	
	public Goods(String name, int amount) {
		this();
		System.out.println(name + " was sold of amount: " + amount);
	}
	
	public Goods(String name) {
		this();
		System.out.println(name + " was sold");
	}
}
