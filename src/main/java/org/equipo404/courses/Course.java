package org.equipo404.courses;

import org.equipo404.student.Student;
import org.equipo404.fees.CoursesPrice;
import org.equipo404.fees.Level;
import org.equipo404.learningmodes.LearningModeStrategy;

import java.util.ArrayList;
import java.util.List;

public class Course extends CourseRaw implements Subject<Student>{

    private double price;
    private List<Student> students;

    public Course(CourseType courseType, Level level, LearningModeStrategy learningMode) {
        super(courseType, level, learningMode);
        this.price = CoursesPrice.getPrice(courseType, level);
        this.students = new ArrayList<>();
    }

    @Override
    public void addElement(Student student) {
        System.out.println("El estudiante: " + student + " se ha inscrito a la clase " + this);
       students.add(student);
    }

    @Override
    public void removeElement(Student student) {
        System.out.println("El estudiante: " + student + " se ha dado de baja de la clase " + this);
        students.remove(student);

    }



    @Override
    public void sendNotifications(List<String> messages) {
        students.stream().forEach(student -> student.update(messages));
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
