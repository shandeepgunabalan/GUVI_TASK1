package task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class SpecialGifts {
	public static void main(String[] args) {

		List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Mike", "Amanda", "John", "Alex", "Steve",
				"Anna", "Greg");

		List<String> specialGiftStudents = students.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println("Students receiving special gifts:");
		specialGiftStudents.forEach(System.out::println);
	}
}