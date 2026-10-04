package com.Student.Stream;
import java.util.Scanner;
public class Driver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentRepository stdr = new StudentRepository();
		StudentService stds = new StudentService();
		
		while (true) {
			stdr.entrychoice();
			System.out.println("enter your choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StudentRepository.setStudent();
				break;
			case 2:
				stds.findById();
				break;
			case 3:
				stds.displayAllStudent();
				break;
			case 4:
				stds.sortedById();
				break;
			case 5:
				stds.sortedByMark();
				break;
			case 6:
				stds.findByCourse();
				break;
			case 7:
				stds.findMarkAbove60();
				break;
			case 8:
				stds.highestMark();
				break;
			case 9:
				stds.lowestMark();
				break;
			case 10:
				stds.averageMarks();
				break;
			case 11:
				stds.countStudent();
				break;
			case 12:
				stds.displayName();
				break;
			case 13:
				stds.groupByCourse();
				break;
			case 14:
				stdr.deleteStudent();
				break;
			case 15:
				stdr.exit();
				break;
				
			default:
				System.out.println("enter a wrong choice");
				break;
			}
			
		}

	}

}
