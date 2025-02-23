package org.equipo404.courses;
/**
 * Enum que representa los diferentes tipos de cursos disponibles en el sistema.
 * Cada tipo de curso tiene un nombre asociado que describe el curso de manera más legible.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */
public enum CourseType {
    /**
     * Curso de Programación en Java.
     */
    PROGRAMACION_JAVA("Programacion en Java"),
    /**
     * Curso de Ecuaciones Diferenciales y en Diferencia.
     */
    ECUACIONES_DIFERENCIALES("Ecuaciones diferenciales y en diferencia"),
    /**
     * Curso de Canto de Ópera.
     */
    CANTO("Canto de opera");
    /**
     * Nombre del tipo de curso.
     */

    private String name;
    /**
     * Constructor que inicializa el nombre del tipo de curso.
     * 
     * @param name Nombre del tipo de curso.
     */

    CourseType(String name){
        this.name = name;
    }
    /**
     * Obtiene el nombre del tipo de curso.
     * 
     * @return El nombre del tipo de curso.
     */

    public String getName() {
        return name;
    }

}
