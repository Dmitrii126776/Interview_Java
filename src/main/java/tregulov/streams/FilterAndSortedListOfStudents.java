package tregulov.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortedListOfStudents {
    public static void main(String[] args) {


        int[] array = {5, 4, 3, 8, 1};
        System.out.println(Arrays.toString(array)); // [5, 4, 3, 8, 1]

        int[] even = Arrays.stream(array)
                .filter(el -> el % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(even)); // [4, 8]

        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 3, 7.5, 21),
                new Student("Sam", 2, 8.0, 19),
                new Student("Jack", 5, 8.5, 23),
                new Student("Mike", 4, 7.0, 22),
                new Student("Fill", 1, 9.0, 18)

        ));

        List<Student> sortedByCourse = students.stream()
                .sorted(Comparator.comparingInt(Student::getCourse))
                .collect(Collectors.toList());
        System.out.println(sortedByCourse);

        List<Student> sortedByavrGrade = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAvrGrade))
                .collect(Collectors.toList());
        System.out.println(sortedByavrGrade);

        List<Student> sortedByName = students.stream()
                .sorted(Comparator.comparing(Student::getName)
                ).collect(Collectors.toList());
//        List<Student> sortedByName = students.stream().sorted((x, y) ->
//                x.getName().compareTo(y.getName())
//        ).collect(Collectors.toList());
        System.out.println(sortedByName);

        students = students.stream()
                .filter(el -> el.getCourse() < 3 && el.getAvrGrade() >= 8.0)
                .collect(Collectors.toList());
        System.out.println(students);
//         [Student{name='Sam', course=2, avrGrade=8.0}, Student{name='Fill', course=1, avrGrade=9.0}]
    }
}
