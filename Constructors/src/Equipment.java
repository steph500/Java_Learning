
public class Equipment {
	String namE;
	String valuE;
	String quantitY;
	
	public Equipment(String name) {
		this.namE = name;
		System.out.println(name + " was sold");
	}
	
	public Equipment( String name, String value) {
		//this.name = name;
		//this.value = value;
		
		System.out.println(name + " of value: " + value + " was sold");
	}
	
	public Equipment(String name, String value, String quantity) {
		this.namE = name;
		this.valuE = value;
		this.quantitY = quantity;
		
		System.out.println(quantitY + namE + " of value: " + valuE + " was sold");
	}
}
