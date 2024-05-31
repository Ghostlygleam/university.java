package by.vika.universityapp.service;

import by.vika.universityapp.inter.TeacherAction;
import by.vika.universityapp.util.Teacher;

public class TeacherService implements TeacherAction {
    private Teacher teacher;

    public TeacherService(Teacher teacher){
        this.teacher = teacher;
    }

    @Override
    public void attend(){
        System.out.println(teacher.getName()+"is attending at "+teacher.getUniver());
    }

    @Override
    public void work(){
        System.out.println(teacher.getName()+"is checking assignments");
    }
    @Override
    public void teach(){
        System.out.println(teacher.getName()+"is teaching");
    }
    @Override
    public void grade(){
        System.out.println(teacher.getName()+"is grading exam");
    }
}
