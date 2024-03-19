package final_practice.prog8.prob10a;

import java.util.Arrays;
import java.util.List;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        List<Integer> z = Arrays.asList(0, 2, 3, 4);
        List<String> list1 = Arrays.asList("asd", "wer", "wew");

        System.out.println(z.stream().reduce(0, Integer::sum));
        System.out.println(list1.stream().reduce("", (acc, current) -> String.format("%s %s", acc, current)).trim());

        System.out.println(list.stream().reduce(new Simple(false), (accumulator, current) -> accumulator.flag ? accumulator : current).flag);

    }

    public boolean someSimpleIsTrue(List<Simple> list) {
        boolean accum = false;
        for (Simple s : list) {
            accum = accum || s.flag;
        }
        return accum;
    }

}
