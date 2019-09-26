import java.util.Scanner;

class Order {
		String name;
		String quantity;
		
		void order(){
			System.out.println("i would like " + quantity + " of " + name);
		}
}

/*class Person { 
	String name;
	int age;
}
*/

class Input {
	Scanner scanner = new Scanner(System.in);

	void userinput() {
		System.out.println("What item would you like to order ? ");
		String name = scanner.nextLine();
		System.out.println("what amount ? ");
		String quantity = scanner.nextLine();
	}
}

public class Application {
	public static void main(String[] args) {
		
		Order order = new Order();
		order.name = "milk";
		order.quantity = "20 litres";
		order.order();
		
		order.name = "bread";
		order.quantity = "3 loafs";
		order.order();
		
		//ask the user for the inputs 
		Input input = new Input();
		input.userinput();
		order.order();
	}
}
