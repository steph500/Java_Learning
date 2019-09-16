import java.util.Scanner;

public class application {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int x = 1; x < 4; x++) {
			System.out.println("Hello Stephen " + x);
		}
		int y = 4;
		while (y > 1) {
			System.out.println("This is a while loop " + y);

			y = y - 1;
		}

		for (int steph = 0; steph < 5; steph++) {
			System.out.println("This will be printed once");

			int quinton = 1;
			while (quinton < 5) {
				System.out.println("Then this will be printed 4 times: " + quinton);

				quinton++;
			}

		}

		int value = 0;
		do {
			System.out.println("The numbers have not yet reached 5");
			value++;
		} while (value < 5);
		System.out.println(" reached 5");

		int number;
		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} while (number != 0);

		System.out.println("Zero was entered!!!");
	}
}
