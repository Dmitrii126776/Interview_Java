package tregulov.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMapMethod {
    public static void main(String[] args) {
        Student st1 = new Student("Sam", 2, 8.0, 19);
        Student st2 = new Student("Jack", 5, 8.5, 23);
        Student st3 = new Student("Alice", 3, 7.5, 21);
        Student st4 = new Student("Mike", 4, 7.0, 22);
        Student st5 = new Student("Fill", 1, 9.0, 18);

        Faculty economics = new Faculty("Economics");
        Faculty mathematics = new Faculty("Mathematics ");

        economics.addStudentOnFaculty(st1);
        economics.addStudentOnFaculty(st2);
        economics.addStudentOnFaculty(st3);

        mathematics.addStudentOnFaculty(st4);
        mathematics.addStudentOnFaculty(st5);

        System.out.println(economics);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(economics);
        facultyList.add(mathematics);

        facultyList.stream().flatMap(faculty -> faculty.getStudentList().stream())
                .forEach(el -> System.out.println(el.getName()));

    }

    static class Faculty {
        String name;
        List<Student> studentList;

        public Faculty(String name) {
            this.name = name;
            studentList = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Faculty{" +
                    "name='" + name + '\'' +
                    ", studentList=" + studentList +
                    '}';
        }

        public List<Student> getStudentList() {
            return studentList;
        }

        public void addStudentOnFaculty(Student student) {
            studentList.add(student);
        }
    }
}
