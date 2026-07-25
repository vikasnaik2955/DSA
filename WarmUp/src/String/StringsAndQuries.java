package String;

import java.util.*;

public class StringsAndQuries {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aba","baba","aba","xzxb");

        List<String> quries = Arrays.asList("aba","xzxb","ab");

        System.out.println("For the quires it is matching like below\n"+matchingQuriesList(strings,quries));
    }

    private static List<Integer> matchingQuriesList(List<String> strings, List<String> quries) {

        Map<String, Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for (String str : strings){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        for (String qur:quries){
            result.add(map.getOrDefault(qur, 0));
        }

        return result;
    }
}
