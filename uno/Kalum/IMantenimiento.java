package org.danielgarcia.interfaces;

public interface IMantenimiento {
    void agregar(Object elemento);

    Object busar(String id);

    void eliminar(Object elemento);

    void modificar(Object elemento, int posicion);

}