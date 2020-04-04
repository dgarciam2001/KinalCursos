package org.danielgarcia.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;






public class Conexion {
    private Connection conexion;
    private Statement enunciado;
    private static Conexion instancia;
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/kalum2020?user=serverkinal&password=sabado.2020");
            enunciado = conexion.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(InstantiationException e){
            e.printStackTrace();
        } catch(IllegalAccessException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public ResultSet hacerConsulta(String consulta){
        ResultSet resultado = null;
        try {
            PreparedStatement procedimiento = conexion.prepareStatement(consulta);
            resultado = procedimiento.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }
    public static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}