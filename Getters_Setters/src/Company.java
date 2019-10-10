
public class Company {
	private String name;
	private String domain;
	
	
	public void setName(String name) {
		this.name = name;
		System.out.println("his name is :" + name);
	}
	
	String finance (String year, double amount, boolean projection) {
		
		String finance = year + amount + projection;
		
		return finance;
	}
	
	public void technology(String name, String type, int amount) {
		System.out.println(amount + " " + type + " " + name + " were used");
		
	}
}
