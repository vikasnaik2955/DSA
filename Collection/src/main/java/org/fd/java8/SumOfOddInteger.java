package Collection.src.main.java.org.fd.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,3,6,7,9,11);

        int sum = list.stream().filter(l -> l%2 !=0).map(l -> l*l).reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
