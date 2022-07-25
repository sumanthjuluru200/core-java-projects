package streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("sumanth","messi","julur","messi");

        LinkedHashMap<String,Integer> mapCount=new LinkedHashMap<>();
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(list);
    }
}
