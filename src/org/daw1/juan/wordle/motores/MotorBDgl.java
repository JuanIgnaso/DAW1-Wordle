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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

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
       try(Connection conn = DriverManager.getConnection(URL);
         java.sql.PreparedStatement statement = conn.prepareStatement("SELECT palabra FROM palabras WHERE palabra = ? AND lang = ?")){
             statement.setString(1,palabra);
             statement.setString(2,LANG);
             try(ResultSet rs = statement.executeQuery()){
                 if(!rs.next()){
                     return false;
                 }else{
                     return true;
                 }
             }
         } catch (SQLException ex) {
            Logger.getLogger(MotorBDgl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;    
    }

    @Override
    public String obtenerPalabraAleatoria() {
            try{
            Random rd = new Random();
            int aleatorio = rd.nextInt(devolverNumColumnas());
            try(Connection conn = DriverManager.getConnection(URL);
                    
                    java.sql.Statement statement = conn.createStatement();
                    
                    ResultSet rs = statement.executeQuery("SELECT palabra FROM palabras WHERE lang = 'gl' LIMIT " + (aleatorio - 1 + ",") + "1")){
                
                while(rs.next()){
                    String name = rs.getString("palabra");
                    return name;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MotorBDgl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotorBDgl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
            Logger.getLogger(MotorBDgl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MotorBDgl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }
    
           protected  int devolverNumColumnas() throws SQLException{
   
        try(Connection conn = DriverManager.getConnection(URL);
         java.sql.Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery("SELECT count(*) AS total FROM palabras WHERE lang = 'gl'")){
                
            while(rs.next()){
               int total = rs.getInt("total");
               return total;
            }
        }
return 0;
    }
}
