
public class Getters {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "Stephen";
		person.age = 22;
		
		person.speak();
		String moving = person.move();
		
		System.out.println(moving);
		
		Company company = new Company();
		
		company.technology("web browser", "chrome", 2);
		company.technology("anti-virus", "kasparskey", 3);
		company.technology("video player", "vlc", 1);
		
		/*
		String finance = company.finance("Twenty twenty", 30.9, true);
		
		System.out.println(finance);
		*/
		
		System.out.println(company.finance("Twenty twenty ", 30.9, true));
		
		company.setName("steve");
	}
}
