package org.equipo404.courses;

import org.equipo404.fees.Level;
import org.equipo404.learningmodes.LearningModeStrategy;

import java.util.Objects;

/**
 * Representa la información base de un curso, incluyendo el tipo de curso, nivel y modalidad de aprendizaje.
 * Esta clase actúa como base para otros tipos de cursos, proporcionando los atributos esenciales
 * para su configuración.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public class CourseRaw {
    /**
     * Tipo de curso (por ejemplo, online, presencial).
     */

    private CourseType courseType;
     /**
     * Nivel del curso (por ejemplo, básico, intermedio, avanzado).
     */
    private Level level;
    /**
     * Constructor que inicializa un curso con su tipo, nivel y modalidad de aprendizaje.
     * 
     * @param courseType Tipo de curso (por ejemplo, online, presencial).
     * @param level Nivel del curso (por ejemplo, básico, intermedio, avanzado).
     */

    public CourseRaw(CourseType courseType, Level level) {
        this.courseType = courseType;
        this.level = level;
    }
    /**
     * Obtiene el nivel del curso.
     * 
     * @return El nivel del curso.
     */

    public Level getLevel() {
        return level;
    }
    /**
     * Establece el nivel del curso.
     * 
     * @param level El nuevo nivel para el curso.
     */

    public void setLevel(Level level) {
        this.level = level;
    }
    /**
     * Obtiene el tipo de curso.
     * 
     * @return El tipo de curso.
     */

    public CourseType getCourseType() {
        return courseType;
    }
    /**
     * Establece el tipo de curso.
     * 
     * @param courseType El nuevo tipo de curso.
     */

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CourseRaw courseRaw = (CourseRaw) o;
        return courseType == courseRaw.courseType && level == courseRaw.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseType, level);
    }

    /**
     * Obtiene la modalidad de aprendizaje del curso.
     * 
     * @return La modalidad de aprendizaje del curso.
     */



    @Override
    public String toString() {
        return "CourseRaw{" +
                "courseType=" + courseType +
                ", level=" + level +
                '}';
    }
}
