package group;

import student.Student;

import java.util.Arrays;

public class Group {
 private Student[]students;
 private String learn;
 private String data;

    public Group(Student[] students, String learn, String data) {
        this.students = students;
        this.learn = learn;
        this.data = data;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", learn='" + learn + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
