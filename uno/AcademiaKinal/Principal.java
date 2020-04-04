package org.danielgarcia.academiakinal.sistema;

import org.danielgarcia.academiakinal.models.Persona;
import org.danielgarcia.academiakinal.models.Estudiante;
import org.danielgarcia.academiakinal.models.Instructor;
import java.util.ArrayList;

public class Principal {
    public static void main(String args[]) {
        System.out.println("Sistema de control academico");
        Persona javier = new Estudiante("Javier","Martinez","M","K128A",24);
        Estudiante albert = new Estudiante("Albert","Lopez","M","I139J",28);
        Estudiante dayana = new Estudiante("Dayana","Juarez","F","M315K",31);
       

        ArrayList<Persona> ListaPersonas = new ArrayList<Persona>();
        ListaPersonas.add(javier);
        ListaPersonas.add(albert);
        ListaPersonas.add(dayana);

    }
}
