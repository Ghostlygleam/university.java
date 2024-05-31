package by.vika.universityapp.service;

import by.vika.universityapp.inter.StudentActions;
import by.vika.universityapp.util.Student;

public class StudentService implements StudentActions {
    private Student student;

    public StudentService(Student student){
        this.student = student;
    }

    @Override
    public void attend() {
        System.out.println(student.getName() +"is attending classes at "+ student.getUniver().getName());
    }

    @Override
    public void work(){
        System.out.println(student.getName()+"is working on assignments");

    }
    @Override
    public void study(){
        System.out.println(student.getName() +"is studying");
    }
    @Override
    public void takeExam() {
        System.out.println(student.getName()+"is taking exam");
    }

}
