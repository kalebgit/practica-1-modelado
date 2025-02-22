package org.equipo404.courses;

import org.equipo404.student.Observer;

import java.util.List;

public interface Subject<T extends Observer> {

    void addElement(T element);
    void removeElement(T element);
    void sendNotifications(List<String> messages);
}
