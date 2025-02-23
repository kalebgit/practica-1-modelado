package org.equipo404.learningmodes;
/**
 * Implementación concreta de la interfaz {@link LearningModeStrategy} que representa la modalidad de aprendizaje práctico.
 * Esta modalidad se centra en la aplicación de conceptos a través de actividades prácticas y ejercicios.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public class PracticalLearning implements LearningModeStrategy{
    /**
     * Implementación del método {@link LearningModeStrategy#learn()} para la modalidad de aprendizaje práctico.
     * Este método simula el aprendizaje a través de actividades prácticas, mostrando un mensaje en consola.
     */
    @Override
    public void learn() {
        System.out.println("aprendiendo práctica");
    }
}
