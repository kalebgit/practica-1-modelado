package org.equipo404.learningmodes;
/**
 * Implementación concreta de la interfaz {@link LearningModeStrategy} que representa la modalidad de aprendizaje teórico.
 * Esta modalidad se centra en la comprensión de conceptos mediante la teoría y la explicación detallada de los temas.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */
public class TheoreticalLearning implements LearningModeStrategy{
    /**
     * Implementación del método {@link LearningModeStrategy#learn()} para la modalidad de aprendizaje teórico.
     * Este método simula el aprendizaje a través de la teoría, mostrando un mensaje en consola.
     */

    @Override
    public void learn() {
        System.out.println("aprendiendo con teoría");
    }
}
