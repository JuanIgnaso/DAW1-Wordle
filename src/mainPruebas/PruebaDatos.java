/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPruebas;

import java.beans.Statement;
import java.io.File;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class PruebaDatos {
    private static File f = new File(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "data" + File.separator + "dbwordle.db");
    private static final String URL = "jdbc:sqlite:" + f.toString();
    private static final String LANG = "gl";
    
    public static void main(String[] args) throws SQLException {
//        try {
//            visualizarDatos();
//        } catch (SQLException ex) {
//            Logger.getLogger(PruebaDatos.class.getName()).log(Level.SEVERE, null, ex);
//        }
String palabra = "VIRTR";
        System.out.println(existePalabra(palabra));
    }
    
    
    protected static boolean existePalabra(String palabra){
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
            Logger.getLogger(PruebaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;    
    }
  
    
    protected static void visualizarDatos() throws SQLException{
        Random rd = new Random();
                int aleatorio = rd.nextInt(devolverNumColumnas());
        String query = "SELECT palabra FROM palabras WHERE lang = 'es' LIMIT 5,1";
        System.out.println(query);
        try(Connection conn = DriverManager.getConnection(URL);
         java.sql.Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery("SELECT palabra FROM palabras WHERE lang = 'es' LIMIT " + (aleatorio - 1 + ",") + "1")){
                
            while(rs.next()){
                String name = rs.getString("palabra");
                System.out.printf("\n" + name);
            }
        }
    
        }
    
    protected static int devolverNumColumnas() throws SQLException{
        int ocurrencias = 0;
        try(Connection conn = DriverManager.getConnection(URL);
         java.sql.Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery("SELECT count(*) AS total FROM palabras WHERE lang = 'es'")){
                
            while(rs.next()){
               int total = rs.getInt("total");
               return total;
            }
        }
return 0;
    }
}
