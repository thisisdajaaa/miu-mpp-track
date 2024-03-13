package lesson9.part2.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

		boolean hasTrueInList = list.stream().map(item -> item.flag).reduce(false, (accumulator, element) -> accumulator || element);
		System.out.println(hasTrueInList);
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}

}
