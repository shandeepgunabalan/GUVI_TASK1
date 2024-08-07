package task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperCase {
	public static void main(String[] args) {

		Stream<String> names = Stream.of("aBc", "d", "ef");

		List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

		upperCaseNames.forEach(System.out::println);
	}
}