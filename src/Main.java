import course.Course;
import group.Group;
import student.Student;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Nargiza", "Galova", 1988, "nargiza@gmail.com");
        Student student2 = new Student("Uson", "Kamilov", 1999, "uson@gmail.com");
        Student student3 = new Student("Rita", "Bapieva", 1972, "rita@gmail.com");
        Student student4 = new Student("Asan", "Tairov", 1998, "asan@gmail.com");
        Student[] students = {student4,student3};
        Group group = new Group( students,"Java", "5.12.2022");
        Group group1 = new Group(new Student[]{student3, student4}, "Phiton", "22.01.2023");

        Course course = new Course("Peaksoft", "Meder", new Group[]{group1, group}, 5);
        System.out.println(course);
    }

}

