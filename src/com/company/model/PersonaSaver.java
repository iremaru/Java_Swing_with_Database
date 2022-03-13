package com.company.model;

import com.company.connection.ConectionBD;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonaSaver {

    /*TODO: Delete
    private Statement stmt;

    public PersonasCollector() {
        ConectionBD.openConn();
    }*/

    public static DefaultTableModel CargaDatos(/*DefaultTableModel m*/) {
        if (ConectionBD.openConn())
        {
            String[] titulos = {"NIF", "Nombre", "Apellido1", "Apellido2", "Ciudad", "Dirección", "Teléfono", "Fecha Nacimiento", "Sexo", "Tipo"};
            DefaultTableModel m = new DefaultTableModel(null, titulos);

            try {
                Statement stmt = ConectionBD.getStmt();
                ResultSet rs = stmt.executeQuery("select * from persona");
                String[] fila = new String[10];

                while (rs.next()) {
                    fila[0] = rs.getString("nif");
                    fila[1] = rs.getString("nombre");
                    fila[2] = rs.getString("apellido1");
                    fila[3] = rs.getString("apellido2");
                    fila[4] = rs.getString("ciudad");
                    fila[5] = rs.getString("direccion");
                    fila[6] = rs.getString("telefono");
                    fila[7] = rs.getString("fecha_nacimiento");
                    fila[8] = rs.getString("sexo");
                    fila[9] = rs.getString("tipo");
                    m.addRow(fila);
                }
            } catch (SQLException e) {}

            return m;
        }

        return null;
    }

    public static ArrayList<String[]>  getData() {
        if (ConectionBD.openConn())
        {
            ArrayList<String[]> persons = new ArrayList<>();

            try {
                Statement stmt = ConectionBD.getStmt();
                ResultSet rs = stmt.executeQuery("select * from persona");
                String[] properties = new String[10];

                while (rs.next()) {
                    properties[0] = rs.getString("id");
                    properties[1] = rs.getString("nif");
                    properties[2] = rs.getString("nombre");
                    properties[3] = rs.getString("apellido1");
                    properties[4] = rs.getString("apellido2");
                    properties[5] = rs.getString("ciudad");
                    properties[6] = rs.getString("direccion");
                    properties[7] = rs.getString("telefono");
                    properties[8] = rs.getString("fecha_nacimiento");
                    properties[9] = rs.getString("sexo");
                    properties[10] = rs.getString("tipo");
                    persons.add(properties);
                }
            } catch (SQLException e) {}

            ConectionBD.closeConn();
            return persons;
        }

        return null;
    }

    public static void pushToDB(ArrayList<String[]> items)
    {
        //TODO: Push data to DB
        if (ConectionBD.openConn())
        {
            ConectionBD.closeConn();
        }
        System.out.print(new NotImplementedException().getMessage());
    }

}
