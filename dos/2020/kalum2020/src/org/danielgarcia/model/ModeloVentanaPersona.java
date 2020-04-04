package org.danielgarcia.model;

import org.danielgarcia.bean.Alumno;
import org.danielgarcia.bean.Persona;
import org.danielgarcia.interfaces.IMantenimiento;
import org.danielgarcia.db.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloVentanaPersona extends AbstractTableModel implements IMantenimiento {
    
    private final String[] encabezados = { "Id", "Nombres", "Apellidos", "Fecha nacimiento" };

    private final ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public String getColumnName(final int column) {
        return encabezados[column];
    }

    public int getColumnCount() {
        return encabezados.length;
    }

    public int getRowCount() {
        return listaPersonas.size();
    }

    public Object getValueAt(final int fila, final int columna) {
        final Persona elemento = listaPersonas.get(fila);
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
    public void agregar(final Object elemento) {
        this.listaPersonas.add((Persona) elemento);
        fireTableDataChanged();
    }

    @Override
    public Object busar(final String id) {
        Object resultado = null;
        for (final Persona elemento : this.listaPersonas) {
            if (elemento.getId().equals(id)) {
                resultado = elemento;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void eliminar(final Object elemento) {
        this.listaPersonas.remove(elemento);
    }

    @Override
    public void modificar(final Object elemento, final int posicion) {
        this.listaPersonas.set(posicion, (Persona) elemento);
    }

    public void obtenerDatos() {
        final ResultSet registros = Conexion.getInstancia().hacerConsulta("call sp_ConsultarAlumnos()");
        try {
            while (registros.next()) {
                final Persona nuevo = new Alumno();
                nuevo.setId(registros.getString("id"));
                ((Alumno) nuevo).setCarne(registros.getString("carne"));
                nuevo.setNombres(registros.getString("nombres"));
                nuevo.setApellidos(registros.getString("apellidos"));
                nuevo.setFechaNacimiento(registros.getDate("fecha_nacimiento"));
                listaPersonas.add(nuevo);
            }
        } catch (final Exception e) {

        }
    }

    private static final long serialVersionUID = 1L;

    public ModeloVentanaPersona() {
        obtenerDatos();
    }

}
