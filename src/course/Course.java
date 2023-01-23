package course;

import group.Group;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String teacherName;
    private Group[] groups;
    private int groupName;

    public Course(String courseName, String teacherName, Group[] groups, int groupName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.groups = groups;
        this.groupName = groupName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", groupName=" + groupName +
                '}';
    }
}

