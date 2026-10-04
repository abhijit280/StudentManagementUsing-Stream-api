package com.Student.Stream;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class StudentRepository {
	static Scanner sc = new Scanner(System.in);

	private static Set<Student>students = new HashSet<Student>();
	
	public static Set<Student> getStudent (){
		return students;
	}
	
//	public void addStudent() {
//		students.addAll(setStudent());
//
//	}
	public void deleteStudent() {
		
		if (students.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		System.out.println("enter the id of student ");
		int id1= sc.nextInt();
		students.removeIf(student -> student.getId() == id1);
		System.out.println("Deleted Succesful");
	}
	public void exit() {
		System.out.println(" Exit Succesful");
		System.exit(0);
	}
	
	
	public static Set<Student> setStudent() {

		System.out.println("how many student you want to add :");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Student No : " + (i + 1));
			System.out.println("Enter your Student Id :");
			int Id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your Name :");
			String name = sc.nextLine();
			System.out.println("Enter your Age :");
			int age = sc.nextInt();
			System.out.println("Enter your Course :");
			String course = sc.next();
			System.out.println("Enter your Mark :");
			double marks = sc.nextDouble();
			students.add(new Student(Id, name, age, course, marks));
		}
		return students;
	}
	public void entrychoice() {
		System.out.println("1. Add students");
		System.out.println("2. Find Student By ID");
		System.out.println("3. Display All Students");
		System.out.println("4. Display Students Sorted By ID ");
		System.out.println("5. Display Students Sorted By Marks");
		System.out.println("6. Find Students By Course");
		System.out.println("7. Find Students With Marks >= 60");
		System.out.println("8. Find Highest Marks");
		System.out.println("9. FIND LOWEST MARKS");
		System.out.println("10. Calculate Average Marks");
		System.out.println("11. Count Students");
		System.out.println("12. Display Student Names");
		System.out.println("13. Group Students By Course");
		System.out.println("14. Delete Student");
		System.out.println("15. Exit");
		
	}

}
