import java.util.Scanner;

public class Animals {
	String name;
	String type;
	int age;
	
	
	void eat() {
		if (type == "carnivore") {
			System.out.println("The " + name + " ate some meat");
		}
		else if (type == "herbivore") {
			System.out.println("The "+ name + " ate some grass and plants");
		}
		else if (type == "omnivore") {
			System.out.println("The "+ name + " eats both meat and vegetation");
		}
		else {
			System.out.println("please specify the type of animal if its an omnivore, herbivore or carnivore");
		}
	}
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter name of animal: ");
		name = scanner.nextLine();
		System.out.println("Please enter type of animal: ");
		type = scanner.nextLine();
		System.out.println("Please enter age of animal: ");
		age = scanner.nextInt();
	}
	
}
