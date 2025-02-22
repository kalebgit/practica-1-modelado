package org.equipo404.fees;

import org.equipo404.courses.CourseType;

import java.util.Map;

public  class CoursesPrice {

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

    public static double getPrice(CourseType course, Level level) {
         Double result = PRICES.getOrDefault(course, Map.of()).getOrDefault(level, 0.0);
         return result.doubleValue();
    }

}
