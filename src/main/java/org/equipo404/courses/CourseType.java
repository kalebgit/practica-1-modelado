package org.equipo404.courses;

public enum CourseType {
    PROGRAMACION_JAVA("Programacion en Java"),
    ECUACIONES_DIFERENCIALES("Ecuaciones diferenciales y en diferencia"),
    CANTO("Canto de opera");

    private String name;

    CourseType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
