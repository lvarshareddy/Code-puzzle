package com.project.csvreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVreader {

	public static void main(String[] args) {
		

		String csvFile = filePath();
		String line = "";
		String cvsSplitBy = ",";
		// private static CalculateCombination;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] products = line.split(cvsSplitBy);
				double n = products.length;
				double[] set = new double[(int) n];

				double[] set2 = new double[(int) n];

				for (int i = 0; i < n; i++) {
					set[i] = Double.parseDouble(products[i]);

				}

				
				for (int i = 1, j = 0; i < n; i++) {

					set2[j] = set[i];
					j++;

				}

				double sum = set[0];

				System.out.println(sum);
				System.out.println(set2[0]);

				if (CalculateCombination.isSubsetSum(set2, n, sum) == true)
					System.out.println("Found a combination with given sum :" + sum);
				else
					System.out.println("There is no combination  with given sum:" + sum);

			}

		} catch (IOException e) {
			System.out.println(e);;
		}

	}

	private static String filePath() {
		String input=null;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter valid path : ");
		
	
		input = scanner.nextLine();
		
		
		
		System.out.println("Entered Path : " + input);
		System.out.println("-----------\n");

		scanner.close();
		return input;

	}

}
