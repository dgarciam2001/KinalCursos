package org.danielgarcia.model;

import org.danielgarcia.bean.Persona;
import org.danielgarcia.interfaces.IMantenimiento;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloVentanaPersona extends AbstractTableModel implements IMantenimiento {
    private String[] encabezados = { "Id", "Nombres", "Apellidos", "Fecha nacimiento" };

    private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public String getColumnName(int column) {
        return encabezados[column];
    }

    public int getColumnCount() {
        return encabezados.length;
    }

    public int getRowCount() {
        return listaPersonas.size();
    }

    public Object getValueAt(int fila, int columna) {
        Persona elemento = listaPersonas.get(fila);
        String resultado = "";

        switch (columna) {
            case 0:
                resultado = elemento.getId();
                break;
            case 1:
                resultado = elemento.getNombres();
                break;
            case 2:
                resultado = elemento.getApellidos();
                break;
            case 3:
                resultado = String.valueOf(elemento.getFechaNacimiento());
                break;
        }

        return resultado;

    }

    @Override
    public void agregar(Object elemento) {
        this.listaPersonas.add((Persona) elemento);
        fireTableDataChanged();
    }

    @Override
    public Object busar(String id) {
        Object resultado = null;
        for (Persona elemento : this.listaPersonas) {
            if (elemento.getId().equals(id)) {
                resultado = elemento;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void eliminar(Object elemento) {
        this.listaPersonas.remove(elemento);
    }

    @Override
    public void modificar(Object elemento, int posicion) {
        this.listaPersonas.set(posicion, (Persona) elemento);
    }

    private static final long serialVersionUID = 1L;

}
