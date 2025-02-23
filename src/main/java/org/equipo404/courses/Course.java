package org.equipo404.courses;

import org.equipo404.student.Student;
import org.equipo404.fees.CoursesPrice;
import org.equipo404.fees.Level;
import org.equipo404.learningmodes.LearningModeStrategy;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa un curso con un tipo, nivel y modalidad de aprendizaje.
 * Los estudiantes pueden inscribirse o darse de baja del curso.
 * 
 * @author Saul
 * @version 1.0
 */

public class Course extends CourseRaw implements Subject<Student>{
    /**
     * Precio del curso calculado en base a su tipo y nivel.
     */

    private double price;
    /**
     * Lista de estudiantes inscritos en el curso.
     */
    private List<Student> students;
    /**
     * Constructor que inicializa un curso con su tipo, nivel y modalidad de aprendizaje.
     * 
     * @param courseType Tipo de curso.
     * @param level Nivel del curso.
     * @param learningMode Estrategia de modalidad de aprendizaje.
     */

    public Course(CourseType courseType, Level level, LearningModeStrategy learningMode) {
        super(courseType, level, learningMode);
        this.price = CoursesPrice.getPrice(courseType, level);
        this.students = new ArrayList<>();
    }
    /**
     * Inscribe a un estudiante en el curso.
     * 
     * @param student El estudiante a inscribir.
     */

    @Override
    public void addElement(Student student) {
        System.out.println("El estudiante: " + student + " se ha inscrito a la clase " + this);
       students.add(student);
    }
    /**
     * Elimina a un estudiante del curso.
     * 
     * @param student El estudiante a dar de baja.
     */

    @Override
    public void removeElement(Student student) {
        System.out.println("El estudiante: " + student + " se ha dado de baja de la clase " + this);
        students.remove(student);

    }
    /**
     * Envía notificaciones a todos los estudiantes inscritos en el curso.
     * 
     * @param messages Lista de mensajes a enviar.
     */



    @Override
    public void sendNotifications(List<String> messages) {
        students.stream().forEach(student -> student.update(messages));
    }
    /**
     * Obtiene el precio del curso.
     * 
     * @return Precio del curso.
     */

    public double getPrice() {
        return price;
    }
    /**
     * Establece un nuevo precio para el curso.
     * 
     * @param price Nuevo precio del curso.
     */

    public void setPrice(double price) {
        this.price = price;
    }

}
