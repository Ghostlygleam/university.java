package by.vika.universityapp.util;

public class Student {

    private String name;
    private Univer univer;
    private Teacher teacher;

    public Student(String name, Univer univer, Teacher teacher){
        this.name = name;
        this.univer = univer;
        this.teacher = teacher;

    }

    public  String getName(){
        return  name;
    }

    public Univer getUniver(){
        return univer;
    }

    public Teacher getTeacher(){
        return teacher;
    }
}
