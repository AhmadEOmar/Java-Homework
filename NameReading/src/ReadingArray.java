import java.util.Scanner;
import java.util.ArrayList;

public class ReadingArray {
	
	static ArrayList<String> StringSize = new ArrayList<String>();

	public static void main(String[] args) {
		
		Scanner count = new Scanner(System.in);
		System.out.print("Enter anything: ");
		String input = count.nextLine();
		StringSize.add(input);
		
		System.out.print("Enter another string: ");
		StringSize.add(count.nextLine());
		
		System.out.print("Enter one last one: ");
		StringSize.add(count.nextLine());
		
		
		System.out.println("The array has " + StringSize.size() + " strings in it.");
		
		for (int i = 0; i < StringSize.size(); i++)
		{
			System.out.println("String " + i + ": " + StringSize.get(i));
			System.out.println("This string has " + StringSize.get(i).length() + " characters.");
		}
		

	}

}