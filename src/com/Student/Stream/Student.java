package com.Student.Stream;

public class Student {

	private String name;
	private int id;
	private double mark;
	private int age;
	private String course;

	public Student(int studentId, String name, int age, String course, double marks) {

		this.id = studentId;
		this.name = name;
		this.age = age;
		this.course = course;
		this.mark = marks;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getMark() {
		return mark;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		return this.id == std.id;
	}
	
	 @Override
	    public String toString() {
	        return "Student{" +
	                "studentId=" + id +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", course='" + course + '\'' +
	                ", marks=" + mark +
	                '}';
	    }
}
