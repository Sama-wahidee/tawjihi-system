import java.util.ArrayList;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		System.out.println("Please enter the numbers you want to check, enter 0 to stop!");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			list.add(num);
			num = input.nextInt();
		}
		RemoveDuplicate(list);
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void RemoveDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<>();
		if (list.isEmpty()) {
			System.out.println("Erorr, you didn't enter any number!!!");
		} else {

			for (int i = 0; i < list.size(); i++) {
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}
		}
		list.clear();
		list.addAll(newList);
	}
}
