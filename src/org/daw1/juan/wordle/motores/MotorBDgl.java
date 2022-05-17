/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;

import java.io.File;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan navarrete
 */
public class MotorBDgl implements IMotor {

    private static File f = new File(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "data" + File.separator + "dbwordle.db");
    private static final String URL = "jdbc:sqlite:" + f.toString();
    private final String LANG = "gl";

    @Override
    public boolean existePalabra(String palabra) {
        return true;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "HOLAL";
    }


    @Override
    public boolean addPalabra(String palabra) {
     try(Connection conn = DriverManager.getConnection(URL);
       PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras(palabra,lang) VALUES(?,?)")){         
          ps.setString(1,palabra);
          ps.setString(2,LANG); 
          int insertado = ps.executeUpdate();
          if(insertado > 0){
              return true;
          }else{
              return false;
          }
          
    }   catch (SQLException ex) {      
            Logger.getLogger(MotorBDes.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return false;
    }

@Override
    public boolean removePalabra(String palabra) {
          try(Connection conn = DriverManager.getConnection(URL);
       PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ? AND lang = ?")){         
          ps.setString(1,palabra);
          ps.setString(2,LANG); 
          int insertado = ps.executeUpdate();
          if(insertado > 0){
              return true;
          }else{
              return false;
          }
          
    }   catch (SQLException ex) {   
            Logger.getLogger(MotorBDes.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }
}
