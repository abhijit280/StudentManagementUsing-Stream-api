package com.Student.Stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Scanner;
public class StudentService {
	 Scanner sc = new Scanner(System.in);
	
//	StudentRepository stdr = new StudentRepository();
//	Set<Student>studentss = new HashSet<Student>(StudentRepository.getStudent());
	Set<Student> studentss = StudentRepository.getStudent();
	public void findById() {
		if (studentss.isEmpty()) {
			System.out.println("Please add student details first");
		    return;
		}
		System.out.println("enter Student Id :");
		int id = sc.nextInt();
		studentss.stream().filter(a->a.getId() == id).findFirst().ifPresentOrElse(System.out::println,()->System.out.println("Invalid Student ID"));
	}
	public void displayAllStudent() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().forEach(System.out::println);
	}
	public void sortedById() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().sorted(Comparator.comparingInt(Student::getId)).forEach(System.out::println);
	}
	public void sortedByMark() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().sorted(Comparator.comparingDouble(Student::getMark).reversed()).forEach(System.out::println);
	}
	public void findByCourse() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		System.out.println("enter Student Course:");
		String course = sc.nextLine();
		studentss.stream().filter(a->a.getCourse().equalsIgnoreCase(course)).forEach(System.out::println);
	}
	public void findMarkAbove60() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().filter(a->a.getMark()>60).forEach(System.out::println);
	}
	public void highestMark() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().sorted(Comparator.comparingDouble(Student::getMark).reversed()).findFirst().ifPresent(System.out::println);
	}
	public void lowestMark() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().sorted(Comparator.comparingDouble(Student::getMark)).findFirst().ifPresent(System.out::println);
	}
	public void averageMarks() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		double average = studentss.stream().mapToDouble(Student::getMark).average().orElse(0);

	    System.out.println("Average Marks : " + average);
	}
	public void countStudent() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		long num = studentss.stream().count();
		System.out.println("total students : "+num);
	}
	public void displayName() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		studentss.stream().map(Student::getName).forEach(System.out::println);
	}
	public void groupByCourse() {
		if (studentss.isEmpty()) {
		    System.out.println("Please add student details first");
		    return;
		}
		Map<String, List<Student>> group = studentss.stream().collect(Collectors.groupingBy(Student::getCourse));
		System.out.println(group);
	}
	public void changeName(int id ,String name) {
		studentss.stream().filter(student->student.getId()==id).findFirst().ifPresentOrElse(student->{student.setName(name); System.out.println("name update succesfull");},()-> System.out.println("Invalid id"));
		
	}
	
	
}
