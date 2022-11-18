import java.util.ArrayList;
import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		System.out.println("Please enter the numbers you want to check, enter 0 to stop!");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while (num != 0) {
			list.add(num);
			num = input.nextInt();
		}
		if (Max(list) == null) {
			System.out.println("Erorr, you didn't enter any number!!!");
		} else {
			System.out.println("The maximum number is " + Max(list));
		}
	}

	public static Integer Max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return null;
		}
		int max = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i) > max) {
				max = list.get(i);
			}
		return max;

	}
}
