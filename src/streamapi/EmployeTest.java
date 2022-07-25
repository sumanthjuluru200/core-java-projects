package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeTest {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        list.add(new Employe(100, "sumanth", "chennai"));
        list.add(new Employe(101, "ashok", "chennai"));
        list.add(new Employe(102, "madhu", "chennai"));
        list.add(new Employe(103, "sai krishna", "hyderabad"));
        list.add(new Employe(104, "ravi", "hyderabad"));
        list.add(new Employe(105, "srikanth", "chennai"));
        list.add(new Employe(106, "mahesh", "hyderabad"));
        list.add(new Employe(107, "ram", "chennai"));
        list.add(new Employe(108, "vijay", "hyderabad"));
        list.add(new Employe(109, "prabhas", "hyderabad"));
        list.add(new Employe(110, "nani", "chennai"));

//        list.stream().filter(m -> m.getId() >= 105).filter(t -> t.getCity() == "hyderabad").forEach(System.out::println);
//
//        System.out.println("list to map");
//
//        Map<Integer, String> convertedMap = list.stream().collect(Collectors.toMap(m -> m.getId(), m -> m.getName()));
//        System.out.println(convertedMap);
//
//        System.out.println("maximum id");
//        Employe maxId = list.stream().max(Comparator.comparing(Employe::getId)).get();
//        System.out.println(maxId);
//
//        System.out.println("Minimum id");
//        Employe minId = list.stream().min(Comparator.comparing(Employe::getId)).get();
//        System.out.println(minId);

        System.out.println("Sortig based on name ");
        list.stream().sorted(Comparator.comparing(Employe::getName).reversed()).forEach(System.out::println);
        System.out.println("Sorting based on id ");
        list.stream().sorted(Comparator.comparing(Employe::getId).reversed()).forEach(System.out::println);


    }
}
