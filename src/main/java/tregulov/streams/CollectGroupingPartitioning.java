package tregulov.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingPartitioning {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(List.of(
                new Student("Sam", 2, 9.0, 19),
                new Student("Jack", 4, 8.5, 23),
                new Student("Alice", 3, 7.5, 21),
                new Student("Fill", 1, 8.0, 18),
                new Student("Mike", 4, 7.0, 22)
        ));

//        Map<Integer, List<Student>> map = students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        }).collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvrGrade() > 8));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
