package org.equipo404.student;

import com.sun.jdi.IntegerValue;
import org.equipo404.courses.Course;
import org.equipo404.courses.CourseRaw;
import org.equipo404.learningmodes.LearningModeStrategy;
import org.equipo404.util.TerminalUI;

import java.util.*;

/**
 * Representa a un estudiante que está inscrito en cursos y puede recibir notificaciones (anuncios).
 * Implementa la interfaz {@link Observer}, lo que permite al estudiante recibir actualizaciones o anuncios enviados
 * por un sujeto (como un curso).
 * 
 * Un estudiante tiene un nombre, un correo electrónico, una cantidad de dinero disponible, y un historial de cursos.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public class Student implements Observer {
    private String name;
    private String email;
    private double availableMoney;
    private LearningModeStrategy learningMode;
    private Map<CourseRaw, Integer> history;
    /**
     * Constructor que inicializa un estudiante con su nombre, correo electrónico y dinero disponible.
     * 
     * @param name Nombre del estudiante.
     * @param email Correo electrónico del estudiante.
     * @param availableMoney Dinero disponible del estudiante.
     */

    public Student(String name, String email, double availableMoney, LearningModeStrategy learningMode) {
        this.name = name;
        this.email = email;
        this.availableMoney = availableMoney;
        this.learningMode = learningMode;
        this.history = new HashMap<>();
    }
    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */

    public String getName() {
        return name;
    }
     /**
     * Establece el nombre del estudiante.
     * 
     * @param name Nombre del estudiante.
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    /**
     * Obtiene el correo electrónico del estudiante.
     * 
     * @return El correo electrónico del estudiante.
     */

    public void setEmail(String email) {
        this.email = email;
    }
     /**
     * Obtiene el saldo de dinero disponible del estudiante.
     * 
     * @return El saldo de dinero disponible.
     */

    public double getAvailableMoney() {
        return availableMoney;
    }
     /**
     * Establece el saldo de dinero disponible del estudiante.
     * 
     * @param availableMoney Nuevo saldo disponible del estudiante.
     */

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }



    public LearningModeStrategy getLearningMode() {
        return learningMode;
    }
    /**
     * Establece la modalidad de aprendizaje del alumno.
     *
     * @param learningMode La nueva modalidad de aprendizaje para el alumno.
     */


    public void setLearningMode(LearningModeStrategy learningMode) {
        System.out.println(this + "ha cambiado su estrategia de aprendizaje");
        this.learningMode = learningMode;
    }
    /**
     * Representa el curso como una cadena de texto.
     *
     * @return Una representación en formato string del curso.
     */


    /**
     * Obtiene el historial de cursos del estudiante.
     *
     * @return Mapa de cursos anteriores del estudiante y el Integer los meses en ella.
     */
    public Map<CourseRaw, Integer> getHistory() {
        return history;
    }
    /**
     * Compara dos objetos {@link Student} para determinar si son iguales.
     * Dos estudiantes se consideran iguales si tienen el mismo nombre y correo electrónico.
     * 
     * @param o Objeto con el cual comparar.
     * @return {@code true} si los estudiantes son iguales, {@code false} de lo contrario.
     */


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }
    /**
     * Genera un valor hash único para el estudiante basado en su nombre y correo electrónico.
     * 
     * @return Valor hash del estudiante.
     */

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
    /**
     * Representa al estudiante como una cadena de texto.
     * 
     * @return Una cadena con la representación del estudiante.
     */

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + name + '\'' +
                ", email='" + email + '\'' +
                ", saldo=" + availableMoney +
                '}';
    }
    /**
     * Método implementado de la interfaz {@link Observer} que permite al estudiante recibir anuncios.
     * Este método simula la actualización de los anuncios mostrando los mensajes recibidos en consola.
     * 
     * @param messages Lista de mensajes o anuncios que el estudiante recibe.
     */

    /// observer logic
    @Override
    public void update(List<String> messages) {
        TerminalUI.createPixelArtBanner("Anuncioss!!");
        messages.stream().forEach((message)->System.out.println(TerminalUI.createLogs(message)));
    }

    ///  specific studnet methods
    public void learn(){
        this.learningMode.learn();
    }



    /**
     * Método que procesa el pago de un estudiante por un curso.
     * Si el estudiante tiene suficiente dinero, se le descuenta el precio del curso.
     * Si no tiene suficiente dinero, se le da de baja del curso.
     *
     * @param course El curso por el cual se realiza el pago.
     */
    public void enrollAndProcessPayment(Course course){
            double price = course.getPrice();
            if (this.getAvailableMoney() >= price) {
                this.setAvailableMoney(this.getAvailableMoney() - price);
                course.addElement(this);
                if(history.keySet().contains(course)){

                    // aumenta en uno los meses de ese curso que ya tenia inscrito
                    Integer monthsInCourse = history.get(course);
                    history.put(course, monthsInCourse.intValue() + 1);

                }else{
                  history.put(course, 1);
                }
                System.out.println(this.getName() + " pagó " + price + " por " + course.getCourseType().getName());
            } else {
                System.out.println(this.getName() + " no tiene dinero suficiente para " + course.getCourseType().getName() + " y ha sido dado de baja.");
                course.removeElement(this);
            }
    }

    /**
     * Método para dar de baja al estudiante del curso (@param)
     *
     * @param course El curso del que se da de baja.
     */
    public void unenroll(Course course){
        course.removeElement(this);
    }



}
