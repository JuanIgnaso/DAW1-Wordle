/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.juan.wordle.motores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author juan navarrete
 */
public interface IMotor {
    
//    public boolean existePalabra(String palabra);
//    
//    public String obtenerPalabraAleatoria();
//    
//    public boolean addPalabra(String palabra);
//    
//    public boolean removePalabra(String palabra);
//    
//    public boolean hayPalabras();
    
     public boolean existePalabra(String palabra) throws SQLException,FileNotFoundException,IOException;
    
    public String obtenerPalabraAleatoria() throws SQLException;
    
    public boolean addPalabra(String palabra) throws SQLException,IOException;
    
    public boolean removePalabra(String palabra) throws SQLException,IOException;
    
    public boolean hayPalabras() throws SQLException;
}
