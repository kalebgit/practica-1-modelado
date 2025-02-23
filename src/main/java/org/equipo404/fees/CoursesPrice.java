package org.equipo404.fees;

import org.equipo404.courses.CourseType;

import java.util.Map;
/**
 * Clase que gestiona los precios de los cursos según su tipo y nivel.
 * Utiliza un mapa estático para almacenar los precios de los cursos, organizados por tipo de curso y nivel.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public  class CoursesPrice {
    /**
     * Mapa estático que contiene los precios de los cursos organizados por tipo de curso y nivel.
     * La estructura es un mapa de tipo `CourseType` a un mapa de `Level` a `Double` (precio del curso).
     */

    private static Map<CourseType, Map<Level, Double>> PRICES = Map.of(
            CourseType.PROGRAMACION_JAVA, Map.of(
                    Level.BASICO, 120.0,
                    Level.INTERMEDIO, 135.0,
                    Level.AVANZADO, 180.0
            ),
            CourseType.ECUACIONES_DIFERENCIALES, Map.of(
                    Level.BASICO, 140.0,
                    Level.INTERMEDIO, 155.0,
                    Level.AVANZADO, 200.0
            ),
            CourseType.CANTO, Map.of(
                    Level.BASICO, 100.0,
                    Level.INTERMEDIO, 125.0,
                    Level.AVANZADO, 150.0
            )
    );
    /**
     * Obtiene el precio de un curso específico según su tipo y nivel.
     * 
     * @param course Tipo de curso para el cual se desea obtener el precio.
     * @param level Nivel del curso (por ejemplo, básico, intermedio, avanzado).
     * @return El precio del curso correspondiente. Si el curso o nivel no están definidos, retorna 0.0.
     */

    public static double getPrice(CourseType course, Level level) {
         Double result = PRICES.getOrDefault(course, Map.of()).getOrDefault(level, 0.0);
         return result.doubleValue();
    }

}
