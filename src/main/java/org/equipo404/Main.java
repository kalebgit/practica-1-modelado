package org.equipo404;

import org.equipo404.courses.*;
import org.equipo404.fees.Level;
import org.equipo404.learningmodes.*;
import org.equipo404.student.Student;
import org.equipo404.util.TerminalUI;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase principal que simula la inscripción y gestión de estudiantes en cursos a lo largo de 9 meses.
 * Gestiona la creación de cursos, la inscripción de estudiantes, el pago de cursos, y las notificaciones mensuales.
 * También maneja el proceso de inscripción y cancelación de estudiantes en los cursos según su saldo disponible.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        List<Course> openedCourses = new ArrayList<>();

        // Crear cursos avanzados
        Course javaAvanzado = new Course(CourseType.PROGRAMACION_JAVA, Level.AVANZADO);
        Course ecuacionesAvanzado = new Course(CourseType.ECUACIONES_DIFERENCIALES, Level.AVANZADO);
        Course cantoAvanzado = new Course(CourseType.CANTO, Level.AVANZADO);

        openedCourses.add(javaAvanzado);
        openedCourses.add(ecuacionesAvanzado);
        openedCourses.add(cantoAvanzado);

        // Crear estudiantes
        Student omar = new Student("Omar", "omar@email.com", 5000, new TheoreticalLearning());
        Student sara = new Student("Sara", "sara@email.com", 10000, new TheoreticalLearning());
        Student maria = new Student("Maria", "maria@email.com", 3000, new TheoreticalLearning());

        // Inscribir estudiantes en cursos
        omar.enrollAndProcessPayment(javaAvanzado);
        omar.enrollAndProcessPayment(ecuacionesAvanzado);
        omar.enrollAndProcessPayment(cantoAvanzado);

        sara.enrollAndProcessPayment(ecuacionesAvanzado);
        maria.enrollAndProcessPayment(javaAvanzado);

        // Simulación de 9 meses
        for (int mes = 1; mes <= 9; mes++) {
            System.out.println(TerminalUI.createPixelArtBanner("Mes " + mes));

            // Cambios en el modo de aprendizaje de María
            if (mes == 3) {
                maria.setLearningMode(new PracticalLearning());
            } else if (mes == 6) {
                maria.setLearningMode(new VisualLearning());
            }

            // María se da de baja en el mes 5
            if (mes == 5) {
                maria.unenroll(javaAvanzado);
            }

            // María se reinscribe en el mes 8 en nivel intermedio
            if (mes == 8) {
                Course javaIntermedio = new Course(CourseType.PROGRAMACION_JAVA, Level.INTERMEDIO);
                openedCourses.add(javaIntermedio);
                maria.enrollAndProcessPayment(javaIntermedio);
            }

            // Notificaciones mensuales
            for (Course course : openedCourses) {
                course.sendNotifications(List.of("Actualización mensual del curso"));
            }

            // Imprimir información de estudiantes inscritos
            for (Course course : openedCourses) {
                System.out.println(TerminalUI.createLogs("Estudiantes inscritos en " + course.getCourseType().getName() + " nivel " + course.getLevel().getName() + ":"));
                course.printStudentsInfo();
            }
        }
    }
}
