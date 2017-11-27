import java.util.Scanner;
public class IndividualDriver{
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	
	for (int i = 0; i < 0; i++)
	{
		System.out.println("Enter first name: ");
		String first = scan.nextLine();
		System.out.println("Enter last name: ");
		String last = scan.nextLine();
		System.out.println("Enter zip code: ");
		int zip = scan.nextInt();
		Individual pers = new Individual(first,last,zip);
	}
	
		System.out.println();
	}
}