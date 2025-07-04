package com.hcl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GPACalculator {
	private List<Integer> gradePointList = new ArrayList<>();

	
	public List<Integer> getGradePointList() {
		return gradePointList;
	}

	
	public void setGradePointList(List<Integer> gradePointList) {
		this.gradePointList = gradePointList;
	}

	// Add grade point based on the grade obtained
	public void addGradePoint(char gradeObtained) {
		int gradePoint = 0;
		switch (gradeObtained) {
		case 'S':
			gradePoint = 10;
			break;
		case 'A':
			gradePoint = 9;
			break;
		case 'B':
			gradePoint = 8;
			break;
		case 'C':
			gradePoint = 7;
			break;
		case 'D':
			gradePoint = 6;
			break;
		case 'E':
			gradePoint = 5;
			break;
		default:
			System.out.println("Invalid grade entered.");
			return;
		}
		gradePointList.add(gradePoint);
	}

	// Calculate GPA
	public double calculateGPAScored() {
		if (gradePointList.isEmpty()) {
			return 0;
		}
		int sum = 0;
		for (int gp : gradePointList) {
			sum += gp;
		}
		return (double) sum / gradePointList.size();
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GPACalculator calculator = new GPACalculator();

		while (true) {
			System.out.println("1. Add Grade");
			System.out.println("2. Calculate GPA");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");

			String input = sc.nextLine();
			int choice;
			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice. Please enter a number between 1 and 3.");
				continue;
			}

			if (choice == 1) {
				System.out.println("Enter the obtained grade");
				String gradeInput = sc.nextLine();
				if (gradeInput.isEmpty()) {
					System.out.println("No grade entered.");
					continue;
				}
				char grade = gradeInput.charAt(0);
				calculator.addGradePoint(grade);
			} else if (choice == 2) {
				if (calculator.getGradePointList().isEmpty()) {
					System.out.println("No GradePoints available");
				} else {
					double gpa = calculator.calculateGPAScored();
					System.out.printf("GPA Scored\n%.1f\n", gpa);
				}
			} else if (choice == 3) {
				System.out.println("Thank you for using the Application");
				break;
			} else {
				System.out.println("Invalid choice. Please enter 1, 2, or 3.");
			}
		}

		sc.close();
	}
}
