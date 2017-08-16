import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("give a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// lets say user entered 5
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15
		// ...
		// 5 * 10 = 50;

		int i;
		int result = 0;
		for (i = 0; i <= 10; i = i + 1) {
			result = number * i;
			Syst5em.out.println(result);
		}
	}

}
