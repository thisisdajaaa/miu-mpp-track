package lesson9.part2.prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, 4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
//	public static void ordering1(List<Integer> list) {
//		List<Integer> greaterThanZero = new ArrayList<>(list.stream().filter(item -> item > 0).sorted().toList());
//		List<Integer> lessThanOrZero = new ArrayList<>(list.stream().filter(item -> item <= 0).sorted(Comparator.reverseOrder()).toList());
//
//		System.out.println(greaterThanZero);
//		System.out.println(lessThanOrZero);
//
//		for (int i = 0; i < lessThanOrZero.size(); i++) {
//			int positive = Math.abs(lessThanOrZero.get(i));
//
//			while (greaterThanZero.contains(positive)) {
//				lessThanOrZero.add(i + 1, greaterThanZero.get(0));
//				greaterThanZero.remove(0);
//			}
//		}
//
//		System.out.println(lessThanOrZero);
//	}

	public static void ordering1(List<Integer> list) {
		List<Integer> integers = list.stream().sorted(Comparator.comparing((Integer item) -> Math.abs(item)).thenComparing(i -> i)).toList();

		System.out.println(integers);
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
//	public static void ordering2(List<String> words) {
//		Map<String, String> map = new HashMap<>();
//
//		words.forEach(item -> {
//			map.put(item, new StringBuilder(item).reverse().toString());
//		});
//
//		List<String> sort = words.stream().sorted((item1, item2) -> Integer.compare(map.get(item1).compareTo(map.get(item2)), 0)).toList();
//
//		System.out.println(sort);
//
//	}

	public static void ordering2(List<String> words) {
		List<String> sort = words.stream().sorted(Comparator.comparing(item -> new StringBuilder(item).reverse().toString())).toList();

		System.out.println(sort);

	}

}
