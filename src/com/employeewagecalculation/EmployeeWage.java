package com.employeewagecalculation;

import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int check;

		CompanyService obj = new CompanyService();

		while (loop) {
			System.out.println(" 1. Add company\n 2. Print Employee Details\n 3. Exit");
			System.out.print(" Please enter your choice: ");
			check = scan.nextInt();

			switch (check) {
			case 1:
				obj.addCompany();
				break;
			case 2:
				obj.printCompany();
				break;
			case 3:
				System.out.println("exiting");
				return;
			default:
				System.out.println(" Please enter valid input");
				break;
			}
		}

		scan.close();
	}

}
