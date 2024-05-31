package by.vika.universityapp.util;
import java.util.List;

public class Teacher {
    private String name;
    private Univer univer;
    private List<Student> students;

    public Teacher(String name, Univer univer, List<Student> students){
        this.name = name;
        this.univer = univer;
        this.students = students;
    }

    public String getName(){
        return name;
    }
    public Univer getUniver(){
        return univer;
    }
    public List<Student> getStudents(){
        return students;
    }
}
