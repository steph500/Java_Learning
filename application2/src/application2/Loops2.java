package application2;

import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String command = input.nextLine();
		
		if (command == "start") {
			System.out.println("machine started");
		}
		else if(command == "stop") {
			System.out.println("Machine stopped");
		}
		else {
			System.out.println("invalid command");
		}
		
		System.out.println(command);

	}
}
