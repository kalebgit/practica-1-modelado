package org.equipo404.courses;

import org.equipo404.fees.Level;
import org.equipo404.learningmodes.LearningModeStrategy;
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
     * Modalidad de aprendizaje del curso (por ejemplo, clases en vivo, material grabado).
     */
    private LearningModeStrategy learningMode;
    /**
     * Constructor que inicializa un curso con su tipo, nivel y modalidad de aprendizaje.
     * 
     * @param courseType Tipo de curso (por ejemplo, online, presencial).
     * @param level Nivel del curso (por ejemplo, básico, intermedio, avanzado).
     * @param learningMode Estrategia de modalidad de aprendizaje (por ejemplo, clases en vivo, material grabado).
     */

    public CourseRaw(CourseType courseType, Level level, LearningModeStrategy learningMode) {
        this.courseType = courseType;
        this.level = level;
        this.learningMode = learningMode;
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
    /**
     * Obtiene la modalidad de aprendizaje del curso.
     * 
     * @return La modalidad de aprendizaje del curso.
     */

    public LearningModeStrategy getLearningMode() {
        return learningMode;
    }
    /**
     * Establece la modalidad de aprendizaje del curso.
     * 
     * @param learningMode La nueva modalidad de aprendizaje para el curso.
     */


    public void setLearningMode(LearningModeStrategy learningMode) {
        this.learningMode = learningMode;
    }
    /**
     * Representa el curso como una cadena de texto.
     * 
     * @return Una representación en formato string del curso.
     */


    @Override
    public String toString() {
        return "CourseRaw{" +
                "courseType=" + courseType +
                ", level=" + level +
                ", learningMode=" + learningMode +
                '}';
    }
}
