package tregulov.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxLimitSkipStudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(List.of(
                new Student("Sam", 2, 9.0, 19),
                new Student("Jack", 5, 8.5, 23),
                new Student("Alice", 3, 7.5, 21),
                new Student("Fill", 1, 8.0, 18),
                new Student("Mike", 4, 7.0, 22)
        ));

        Student minAge = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(minAge);
        System.out.println("--------------------------");

        Student maxGrade = students.stream().max((Comparator.comparingDouble(Student::getAvrGrade))).get();
        System.out.println(maxGrade);
        System.out.println("--------------------------");

        students.stream().filter(el -> el.getAge() > 20).forEach(System.out::println);
        System.out.println("--------------------------");

        students.stream().filter(el -> el.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("--------------------------");

        students.stream().filter(el -> el.getAge() > 20).skip(2).forEach(System.out::println);
    }
}
