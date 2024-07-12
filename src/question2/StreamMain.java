package question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 2, 2, 4, 7, 9, 11, 44, 23, 12, 12, 34);

		List<Integer> result = list.stream().distinct().filter((x) -> (x % 2 == 0)).map(x -> x * x).collect(Collectors.toList());

		System.out.println(result);

	}

}
