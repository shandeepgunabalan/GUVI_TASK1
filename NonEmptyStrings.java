package task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class NonEmptyStrings {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

		nonEmptyStrings.forEach(System.out::println);
	}
}