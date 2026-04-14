package com.mycompany.world_cup_logistics;

import java.sql.Connection;
import java.sql.Statement;
import worldcup.conexion.ConexionDB;

public class World_Cup_Logistics {

    public static void main(String[] args) {
        Connection cn = ConexionDB.conectar();
        
        if (cn != null) {
            try {
                Statement st = cn.createStatement();
                String sql = "INSERT INTO equipo (id, nombre, pais, grupo) "
                          + "VALUES (100, 'Guatemala', 'Guate', 'A')";
                
                st.executeUpdate(sql);
                System.out.println("Dato enviado a pgAdmin con exito");
                
            } catch (Exception e) {
                System.out.println("Error al insertar: " + e.getMessage());
            }
        } else {
            System.out.println("La conexion es nula, revisa ConexionDB");
        }
    }
}