
public class Package {
	public static void main(String[] args) {
		
		//Goods goods = new Goods();
		
		/*
		goods.name = "soap";
		goods.amount = 35;
		*/
		new Goods("Soap");
		new Goods("Toothpaste", 3);
		
		
		/*
		Equipment equipment = new Equipment("Laptop");
		Equipment equipment1 = new Equipment("hard disk", "5 terabyte", "Five");
		Equipment equipment3 = new Equipment("Ram", "DDR 3");
		*/
		
		 new Equipment("laptop");
		 new Equipment("hard disk", "5 terabyte", "Five");
		 new Equipment("RAM", "DDR 4");
	}
}
