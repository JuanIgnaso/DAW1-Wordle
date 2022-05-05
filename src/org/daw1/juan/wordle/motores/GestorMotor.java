/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author juan navarrete
 */
public class GestorMotor {
    private static final File p = new File(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "data" + File.separator + "palabras.txt");
    
    public boolean existeFichero(){
        return p.exists();
    }
    
    
}
