package organizingdata.changeunidirectionaltoassociationtobidirectional;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void disenrollCourse(Course course){
        courses.remove(course);
        course.disenrollStudent(this);

    }
}
