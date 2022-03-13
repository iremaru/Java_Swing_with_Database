package com.company.controller;

import com.company.connection.ConectionBD;
import com.company.model.ModelAsignaturas;
import com.company.model.PersonaSaver;
import com.company.view.DialogoEntrada;
import com.company.view.ViewPanelEntrada;

import javax.swing.*;
import java.awt.event.*;

public class ControllerEntrada implements ActionListener, MouseListener, WindowListener, KeyListener {

    private final ViewPanelEntrada frEntrada = new ViewPanelEntrada();
    /*private final DefaultTableModel m = null;*/

    public ControllerEntrada() {
        iniciarVentana();
        iniciarEventos();
        prepararBaseDatos();
    }

    public void iniciarVentana() {
        frEntrada.setVisible(true);
    }

    public void iniciarEventos() {
        frEntrada.getBoton1Button().addActionListener(this);
        frEntrada.getBoton2Button().addActionListener(this);
        frEntrada.getDialog().addActionListener(this);
        frEntrada.getAsignaturasButton().addActionListener(this);
        frEntrada.getPersonasButton().addActionListener(this);
        frEntrada.getPanelEntrada().addMouseListener(this);
        frEntrada.getTable1().addMouseListener(this);
        frEntrada.addWindowListener(this);
        frEntrada.getTextField1().addKeyListener(this);
        frEntrada.getTextField2().addKeyListener(this);
    }

    public void prepararBaseDatos() {
        PersonaSaver entrada = new PersonaSaver();
        frEntrada.getTable1().setModel(entrada.CargaDatos(/*m*/));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String entrada = e.getActionCommand();

        switch (entrada) {
            case "Botón 1":
                System.out.println("Salida del botón 1");
                frEntrada.getTextField1().setText("Escribe esto");
                break;

            case "Botón 2":
                System.out.println("Salida del botón 2");
                frEntrada.getTextField2().setText("Escribe otro");
                break;

            case "Dialog":
                DialogoEntrada miDialogo = new DialogoEntrada();
                miDialogo.setSize(400, 200);
                miDialogo.setLocation(400, 300);
                miDialogo.setTitle("Entrada de usuario y contraseña");
                miDialogo.setVisible(true);
                if (miDialogo.getUsuario().equals("") || miDialogo.getContrasenia().equals("")) {
                    JOptionPane.showMessageDialog(null, "No has introducido correctamente el usuario o la contraseña, " +
                            "por lo tanto la acción se ha cancelado");
                } else {
                    System.out.println(miDialogo.getUsuario());
                    frEntrada.getTextField1().setText(miDialogo.getUsuario());
                    System.out.println(miDialogo.getContrasenia());
                    frEntrada.getTextField2().setText(miDialogo.getContrasenia());
                }
                break;

            case "Asignaturas":
                ModelAsignaturas asignatura = new ModelAsignaturas();
                frEntrada.getTable1().setModel(asignatura.CargaDatos(/*m*/));
                break;

            case "Personas":
                PersonaSaver persona = new PersonaSaver();
                frEntrada.getTable1().setModel(persona.CargaDatos(/*m*/));
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 3) {
            JOptionPane.showMessageDialog(null, "ha pisado el botón derecho");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("ha salido del programa");
        frEntrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConectionBD.closeConn();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getComponent().equals(frEntrada.getTextField1()))
            JOptionPane.showMessageDialog(null, "Ha escrito la letra: " + e.getKeyChar() + " en el Jtext del usuario");

        if (e.getComponent().equals(frEntrada.getTextField2()))
            JOptionPane.showMessageDialog(null, "Ha escrito la letra: " + e.getKeyChar() + " en el Jtext de la contraseña");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
