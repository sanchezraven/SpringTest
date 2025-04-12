package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {

        Student st1 = new Student("Zaza Roy", 4, 7.3);
        Student st2 = new Student("Miha Ivanov ", 2, 3.3);
        Student st3 = new Student("Zhana Aguzova ", 3, 9.3);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents started");
        System.out.println(students.get(3));
        System.out.println("Inf from getStudents: ");
        System.out.println(students);
        return students;
    }
}
