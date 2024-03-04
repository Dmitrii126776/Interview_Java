package tregulov.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntSumAverageMinMax {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(List.of(
                new Student("Sam", 2, 9.0, 19),
                new Student("Jack", 5, 8.5, 23),
                new Student("Alice", 3, 7.5, 21),
                new Student("Fill", 1, 8.0, 18),
                new Student("Mike", 4, 7.0, 22)
        ));

        List<Integer> courses = students.stream()
                // .mapToInt(Student::getCourse)
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream()
                .mapToInt(Student::getCourse)
                .sum();
        System.out.println(sum);

        double average = students.stream()
                .mapToInt(Student::getCourse)
                // .average().getAsDouble();
                .average().orElse(Double.NaN);
        System.out.println(average);

        int min = students.stream()
                .mapToInt(Student::getCourse)
                .min().getAsInt();
        System.out.println(min);

        int max = students.stream()
                .mapToInt(Student::getCourse)
                .max().getAsInt();
        System.out.println(max);
    }
}
