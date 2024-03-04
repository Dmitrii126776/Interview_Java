package tregulov.streams;

import java.util.ArrayList;
import java.util.List;


public class FindFirstStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Sam", 2, 8.0, 19),
                new Student("Jack", 5, 8.5, 23),
                new Student("Alice", 3, 7.5, 21),
                new Student("Mike", 4, 7.0, 22),
                new Student("Fill", 1, 9.0, 18)
        ));
        Student first = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getCourse() > 2)
                .sorted((x, y) -> x.getAge() - y.getAge())
//                .sorted(Comparator.comparingInt(Student::getAge))
                .findFirst().get();
        System.out.println(first);
    }
}
