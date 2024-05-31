package by.vika.universityapp.service;

import by.vika.universityapp.util.Student;
import by.vika.universityapp.util.Teacher;
import by.vika.universityapp.util.Univer;

import java.util.Arrays;



public class Main {
    public static void main(String[] args){
        Univer univer = new Univer("MIT", null, null);

        Teacher teacher1 = new Teacher("Dr. Arnur", univer, null);
        Teacher teacher2 = new Teacher("Dr. Diana", univer, null);

        Student student1 = new Student("Alice", univer, teacher1);
        Student student2 = new Student("Vika", univer, teacher2);

        univer = new Univer("MIT", Arrays.asList(student1, student2), Arrays.asList(teacher1, teacher2));

        teacher1 = new Teacher("Dr. Smith", univer, Arrays.asList(student1));
        teacher2 = new Teacher("Dr. Johnson", univer, Arrays.asList(student2));

        StudentService studentService1 = new StudentService(student1);
        StudentService studentService2 = new StudentService(student2);

        TeacherService teacherService1 = new TeacherService(teacher1);
        TeacherService teacherService2 = new TeacherService(teacher2);

        System.out.println("Student Service Demo:");
        studentService1.attend();
        studentService1.study();
        studentService1.work();
        studentService1.takeExam();

        System.out.println("\n");

        studentService2.attend();
        studentService2.study();
        studentService2.work();
        studentService2.takeExam();

        System.out.println("\n");


        System.out.println("Teacher Service Demo:");
        teacherService1.attend();
        teacherService1.teach();
        teacherService1.work();
        teacherService1.grade();

        System.out.println("\n");

        teacherService2.attend();
        teacherService2.teach();
        teacherService2.work();
        teacherService2.grade();
    }
}


