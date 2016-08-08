package stateInfoReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StateReader {

	File file;
	Scanner scanner;
	static Scanner input;
	ArrayList<String> lines = new ArrayList<String>();
	
	public static void main(String[] args) {
		StateReader sr = new StateReader();
		input = new Scanner(System.in);
		System.out.print("Enter a state to search: ");
		String state = input.nextLine();
		sr.searchByState(state);
		input.close();
	}
	
	public void readFile(String fileName) {
		try {
			file = new File(fileName);
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
			scanner.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchByState(String state) {
		readFile("reading.txt");
		String[][] stateInfo = new String[5][3];
		int stateCount = 0;
		int total = 0;
		int avgCount = 0;
		boolean filled = false;
		
		for (String line : lines) {
			String[] lineInfo = line.split(",");
			if (lineInfo[1].equals(state)) {
				stateInfo[stateCount] = lineInfo;
				stateCount++;
				filled = true;
			}
		}
		
		if (!filled) {
			System.out.println("You didn't enter a valid state.");
			return;
		}
		
		System.out.printf("Average scores for %s:%n", state);
		for (String[] stateYear : stateInfo) {
			if (!stateYear[2].equals("-1")) {
				total += Integer.parseInt(stateYear[2]);
				avgCount++;
				System.out.printf("    %s: %s%n", stateYear[0], stateYear[2]);
			}
		}
		if(avgCount != 0) {
			System.out.printf("    Overall average: %d%n", total/avgCount);
		}
	}
}
