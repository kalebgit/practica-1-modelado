package org.equipo404;

public interface Subject<T> {

    void addElement(T element);
    void removeElement(T element);
    void sendNotifications();
}
