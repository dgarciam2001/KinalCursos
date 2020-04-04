package org.danielgarcia.iu;

import org.danielgarcia.bean.Alumno;
import org.danielgarcia.bean.Persona;
import org.danielgarcia.bean.Profesor;
import org.danielgarcia.model.ModeloVentanaPersona;
import java.awt.HeadlessException;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.JOptionPane;

public class VentanaPersonas extends JFrame implements KeyListener {

    private JTable tablaPersonas = new JTable();
    private JScrollPane panelTabla = new JScrollPane();
    private ModeloVentanaPersona modelo = new ModeloVentanaPersona();

    public VentanaPersonas(String title) {
        super(title);
        this.setLayout(null);
        this.setSize(500, 400);
        this.tablaPersonas.setModel(modelo);
        panelTabla.setBounds(10, 10, 460, 300);
        panelTabla.setViewportView(this.tablaPersonas);
        this.getContentPane().add(this.panelTabla);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
        
        this.setVisible(true);

    }

    private static final long serialVersionUID = 1L;

    @Override // Se invoca cuando se ha escrito una tecla
    public void keyTyped(KeyEvent e) {

    }

    @Override // Se invoca cunado se presiona una tecla
    public void keyPressed(KeyEvent e) {

    }

    @Override // Se invoca cuando se libera una tecla
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 65) {
            Persona elemento = new Profesor();
            //elemento.setNombres("Daniel Esteban");
            //elemento.setApellidos("Garcia Merida");
            //elemento.setFechaNacimiento(new Date());
            this.modelo.agregar(elemento);
        }

    }

}