package org.equipo404;

import java.util.List;

public class Course implements Subject<Student>{

    private LearningModeStrategy learningMode;
    private Level level;
    private List<Student> students;

    @Override
    public void addElement(Student student) {
       students.add(student);
    }

    @Override
    public void removeElement(Student student) {
        student.notify();
        students.remove(student);

    }

    @Override
    public void sendNotifications() {

    }


}
