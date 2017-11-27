import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;



public class GamePrimer {

	
public static void main(String[] args)  {



	int turnOvers; 
	String description;
	
	String game, inputName = "nfl2013gameStatsEd2.txt";
	String outputName = "TOExtreme.txt";
	PrintWriter outFile = null;
	Scanner scan = null;

	try {
		// Set up Scanner to input file
		scan = new Scanner(new File(inputName));
		// Set up the output file stream
		outFile = new PrintWriter(outputName);

		// Print a header to the output file
		outFile.println();
		outFile.println("TurnOvers");
		outFile.println();

		// Process the input file, one token at a time
		while (scan.hasNext()) {
			turnOvers = scan.nextInt();
			description = scan.nextLine();
		

		
		
	}
	}

		catch (FileNotFoundException e) {
		System.out.println("The file " + inputName + " was not found.");
		}
		// Note that the Scanner throws an InputMismatchException, not a
		// NumberFormatException as indicated in the problem statement
		catch (InputMismatchException e) {
		System.out.println("Format error in input file: " + e);
		} catch (IOException e) {
		System.out.println(e);
		} finally {
		if (outFile != null) {
		outFile.close();
		outFile = null;
		}
		if (scan != null) {
		scan.close();
		scan = null;
		}
		}
		}
		}


	
