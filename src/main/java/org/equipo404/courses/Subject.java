package org.equipo404.courses;

import org.equipo404.student.Observer;

import java.util.List;
/**
 * Interfaz que define las operaciones para un sujeto en el patrón de diseño Observer.
 * Un sujeto puede tener elementos (observadores) registrados que se notificarán cuando el sujeto cambie.
 * Los métodos permiten agregar, eliminar y notificar a los observadores.
 * 
 * @param <T> Tipo de los elementos (observadores) que se registrarán en el sujeto. Deben implementar la interfaz {@link Observer}.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public interface Subject<T extends Observer> {
    /**
     * Agrega un nuevo elemento (observador) al sujeto.
     * 
     * @param element El observador a agregar.
     */

    void addElement(T element);
    /**
     * Elimina un elemento (observador) del sujeto.
     * 
     * @param element El observador a eliminar.
     */
    void removeElement(T element);
    /**
     * Envía una lista de mensajes a todos los observadores registrados.
     * 
     * @param messages Lista de mensajes a enviar a los observadores.
     */
    void sendNotifications(List<String> messages);
}
