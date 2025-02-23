package org.equipo404.learningmodes;
/**
 * Implementación concreta de la interfaz {@link LearningModeStrategy} que representa la modalidad de aprendizaje visual.
 * Esta modalidad se enfoca en la utilización de recursos visuales, como videos, diagramas, y gráficos, para facilitar el aprendizaje.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */
public class VisualLearning implements LearningModeStrategy{
    /**
     * Implementación del método {@link LearningModeStrategy#learn()} para la modalidad de aprendizaje visual.
     * Este método simula el aprendizaje utilizando recursos visuales, mostrando un mensaje en consola.
     */

    @Override
    public void learn() {
        System.out.println("aprendiendo con recursos visuales");
    }
}
