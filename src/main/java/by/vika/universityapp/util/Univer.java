package by.vika.universityapp.util;
import java.util.List;

public class Univer {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public Univer(String name, List<Student> students, List<Teacher> teachers){
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents(){
        return students;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    @Override
    public String toString() {
        return name;
    }

}
