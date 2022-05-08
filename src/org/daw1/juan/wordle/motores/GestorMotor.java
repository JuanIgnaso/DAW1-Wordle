/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;

import java.io.File;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan navarrete
 */
public class GestorMotor  {
    private static final  File p = new File(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "palabras.txt");
    
    public boolean existeFichero(){
        return p.exists();
    }
    
  
    
}
