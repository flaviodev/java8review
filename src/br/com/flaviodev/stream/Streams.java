package br.com.flaviodev.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Course {

	private String name;
	private int amountOfStudents;

	public Course() {}
	
	public Course(String name, int amountOfStudents) {
		this.name = name;
		this.amountOfStudents = amountOfStudents;
	}

	public String getName() {
		return name;
	}

	public int getAmountOfStudents() {
		return amountOfStudents;
	}
}

public class Streams {

	public static void main(String[] args) {

		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Java 8", 100));
		courses.add(new Course("Kotlin", 80));
		courses.add(new Course("Ionic 3", 50));
		courses.add(new Course("React", 300));

		courses.sort(Comparator.comparing(Course::getAmountOfStudents));

		courses.forEach(c -> System.out.println(c.getName() + " - " + c.getAmountOfStudents()));

		// using stream for filtering
		courses.stream()
			.filter(c -> c.getAmountOfStudents() > 90)
			.forEach(c -> System.out.println(c.getName()));

		// using stream for mapping data
		courses.stream()
			.filter(c -> c.getAmountOfStudents() > 90)
			.map(c -> c.getAmountOfStudents())
			.forEach(System.out::println);
		
		// using stream for summing data
		int sum = courses.stream()
			.filter(c -> c.getAmountOfStudents() > 90)
			.mapToInt(c -> c.getAmountOfStudents()).sum();
	
		System.out.println(sum);
		
		// Using Optional
		// using if present (null safe)
		courses.stream()
			.filter(c -> c.getAmountOfStudents() > 90)
			.findAny()
			.ifPresent(c -> System.out.println(c.getName()));
		
		courses.stream()
			.filter(c -> c.getAmountOfStudents() > 90)
			.mapToInt(c -> c.getAmountOfStudents())
			.average().ifPresent(System.out::println);
		
		// getting list from stream
		courses = courses.stream().filter(c -> c.getAmountOfStudents() > 90).collect(Collectors.toList());
		courses.forEach(c -> System.out.println(c.getName()));
		
	}
}
