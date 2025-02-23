package org.equipo404.learningmodes;
/**
 * Interfaz que define la estrategia para la modalidad de aprendizaje de un curso.
 * Las implementaciones de esta interfaz representan diferentes formas de aprendizaje
 * que los estudiantes pueden utilizar, como clases presenciales, clases en línea, o aprendizaje autodidacta.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */
public interface LearningModeStrategy {
    /**
     * Método que define cómo se lleva a cabo el proceso de aprendizaje según la modalidad específica.
     * Las implementaciones de este método deben definir el comportamiento de aprendizaje en cada modalidad.
     */
    void learn();
}
