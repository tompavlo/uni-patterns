package organizingdata.changeunidirectionaltoassociationtobidirectional;

import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students;
    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student){
        students.add(student);
    }

    public void disenrollStudent(Student student){
        students.remove(student);
    }

}
