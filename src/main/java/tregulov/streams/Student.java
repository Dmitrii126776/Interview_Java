package tregulov.streams;

public class Student {
    private String name;
    private int course;
    private double avrGrade;
    private int age;

    public Student(String name, int course, double avrGrade, int age) {
        this.name = name;
        this.course = course;
        this.avrGrade = avrGrade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                ", age=" + age +
                '}';
    }

}
