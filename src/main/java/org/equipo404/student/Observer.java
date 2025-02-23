package org.equipo404.student;

import java.util.List;
/**
 * Interfaz que define un observador en el patrón de diseño Observer.
 * Un observador puede recibir notificaciones de un sujeto (por ejemplo, un curso) cuando ocurren cambios.
 * 
 * El método {@link #update(List)} permite a los observadores recibir los anuncios o notificaciones enviadas por el sujeto.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public interface Observer {
    /**
     * Actualiza al observador con una lista de anuncios o notificaciones.
     * Este método es llamado por el sujeto cuando desea notificar a sus observadores sobre un cambio o actualización.
     * 
     * @param anuncios Lista de mensajes o anuncios a enviar al observador.
     */
    void update(List<String> anuncios);
}
