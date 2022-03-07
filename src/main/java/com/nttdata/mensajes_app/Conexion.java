/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttdata.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class Conexion {

    public Connection getConnection(){
    Connection connection = null;
    String url = " jdbc:mysql://localhost:3306/mensajes_app";
    String user = "root";
    String pass = "";
  
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", user, pass); 
            if(connection !=null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
              System.out.println(e);
        }
        return connection;
    }
}
