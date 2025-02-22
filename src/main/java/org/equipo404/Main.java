package org.equipo404;

import org.equipo404.courses.*;
import org.equipo404.fees.Level;
import org.equipo404.learningmodes.*;
import org.equipo404.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // registro de cursos abiertos para no abrir todos al inicio de la ejecucion
        List<Course> openedCourses = new ArrayList<>();

        // Creacion de los cursos
        Course javaAdvanced = new Course(CourseType.PROGRAMACION_JAVA, Level.AVANZADO, new TheoreticalLearning());
        Course differentialEquationsAdvanced = new Course(CourseType.ECUACIONES_DIFERENCIALES, Level.AVANZADO, new TheoreticalLearning());
        Course operaSingingAdvanced = new Course(CourseType.CANTO, Level.AVANZADO, new PracticalLearning());

        openedCourses.add(javaAdvanced);
        openedCourses.add(differentialEquationsAdvanced);
        openedCourses.add(operaSingingAdvanced);

        // Todos los estudiantes
        Student omar = new Student("Omar", "omar@email.com", 5000);
        Student sara = new Student("Sara", "sara@email.com", 10000);
        Student maria = new Student("Maria", "maria@email.com", 3000);

        // Agregamos los estudiantes con el patron observer
        javaAdvanced.addElement(omar);
        differentialEquationsAdvanced.addElement(omar);
        operaSingingAdvanced.addElement(omar);
        differentialEquationsAdvanced.addElement(sara);
        javaAdvanced.addElement(maria);

        // Simulation of 9 months
        for (int month = 1; month <= 9; month++) {
            System.out.println("\nMes " + month + "...");

            // Omar paga todos sus cursos
            processPayment(omar, javaAdvanced);
            processPayment(omar, differentialEquationsAdvanced);
            processPayment(omar, operaSingingAdvanced);

            // Sara tambien los paga
            processPayment(sara, differentialEquationsAdvanced);

            // maria cambia de cursos en esos meses
            if (month == 3) {
                // se debe crear un nuevo curso cuando se cambia de nivel o modo?
                // porque sino afectaria a todos los alumnos inscritos en ese curso

            } else if (month == 6) {
            }

            // María cancels her course in month 5
            if (month == 5) {
                javaAdvanced.removeElement(maria);
            }

            // María re-enrolls in month 8 at intermediate level
            if (month == 8) {
                Course javaIntermediate = new Course(CourseType.PROGRAMACION_JAVA, Level.INTERMEDIO, new VisualLearning());
                openedCourses.add(javaIntermediate);
                javaIntermediate.addElement(maria);
            }

            // Monthly notifications
            openedCourses.stream().forEach(course->course.sendNotifications(List.of("anuncio de " + course)));
        }
    }

    private static void processPayment(Student student, Course course) {
        double price = course.getPrice();
        if (student.getAvailableMoney() >= price) {
            student.setAvailableMoney(student.getAvailableMoney() - price);
            System.out.println(student.getName() + " pagó " + price + " por " + course.getCourseType().getName());
        } else {
            System.out.println(student.getName() + " no tiene dinero suficiente para " + course.getCourseType().getName() + " y ha sido dado de baja.");
            course.removeElement(student);
        }
    }
}
