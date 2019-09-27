import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		//vales of the variables assigned in the program
		
		Animals animal_1 = new Animals();
		animal_1.name = "Lion";
		animal_1.age = 7;
		animal_1.type = "carnivore";
		
		animal_1.eat();
		
		//values fed in by user
		Animals animal = new Animals();
		Employees employee = new Employees();
		
		animal.input();
		animal.eat();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name of employee: ");
		employee.name = scanner.nextLine();
		System.out.println("Please what section the employee works");
		employee.role = scanner.nextLine();
		
		employee.work();
		
		

	}

}
