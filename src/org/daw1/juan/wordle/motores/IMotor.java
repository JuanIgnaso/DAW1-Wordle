/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.juan.wordle.motores;

import java.io.File;

/**
 *
 * @author juan navarrete
 */
public interface IMotor {
    
    public boolean existePalabra(String palabra);
    
    public String obtenerPalabraAleatoria();
    
    public boolean addPalabra(String palabra);
    
    public boolean removePalabra(String palabra);
}
