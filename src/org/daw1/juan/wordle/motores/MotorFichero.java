/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.daw1.juan.wordle.motores.*;
import java.util.regex.*;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alumno
 */
public class MotorFichero implements IMotor {
     private int LARGO_FICHER0;
     private static final  File p = new File(Paths.get(".").toAbsolutePath().normalize().toString() + File.separator + "data" + File.separator + "palabras.txt");
     private  List<String>palabras; 

    public MotorFichero() {
        palabras = new ArrayList<>();
        LARGO_FICHER0 = lineasFichero();
        cargarLista(palabras);
    }
     

     
     

    @Override
    public boolean existePalabra(String palabra) {
       try(BufferedReader br = new BufferedReader(new FileReader(p))){            
            String linea = br.readLine();
            while(linea != null){              
                palabras.add(linea);
                linea = br.readLine();               
            }            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return palabras.contains(palabra);
    }
    
    //METODO PRIVADO QUE CREA EL FICHERO ASOCIADO AL MOTOR DE PALABRAS
    
    private void crearFichero(){
        if(!existeFichero()){
            try {
                p.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(-1);
            }
           
        }
    } 
    
     protected boolean existeFichero(){
        return p.exists();
    }
    
    
    //DEVUELVE UN STRING DE UNA PALABRA ALEATORIA QUE SE ENCUENTRE DENTRO DEL TXT
    @Override
    public String obtenerPalabraAleatoria() {
          if(!existeFichero()){
            return null;
        }
       if(cargarLista(palabras)==null){
           return null;
       }else{
       Random rn = new Random();
       int aleatorio = rn.nextInt(this.LARGO_FICHER0);
        return palabras.get(aleatorio);
       }
    }

    //METODO PRIVADO QUE CARGA EL CONTENIDO DEL TXT EN UNA LISTA PARA PODER MANEJAR LAS PALABRAS
     private List<String> cargarLista(List <String> palabras){
        if(!existeFichero()){
            return null;
        }
        try(BufferedReader br = new BufferedReader(new FileReader(p))){            
            String linea = br.readLine();
                palabras.clear();
            while(linea != null){ 
                if(!palabras.contains(linea)){
                 palabras.add(linea);   
                }                
                linea = br.readLine();               
            }            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return palabras;
    }
    
      
      //METODO PARA CONSEGUIR LAS LINEAS DEL FICHERO, PARA PODER LUEGO OBTENER UNA
      //PALABRA ALEATORIA
      private int lineasFichero(){
         int lineasFile = 0;
         if(!existeFichero()){
            return lineasFile; 
         }else{
       try(BufferedReader br = new BufferedReader(new FileReader(p))){            
            String linea = br.readLine();
            while(linea != null){
                lineasFile++;
                linea = br.readLine();
            }            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         }
         return lineasFile;
         
    }
    
    //CREAR UNA CLASE QUE MANEJE LAS PALABRAS?
    @Override
    public boolean addPalabra(String palabra) {
    if(!existeFichero()){
            crearFichero();
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(p, true))){
            if(checkPalabra(palabra) && !existePalabra(palabra.toUpperCase())){           
                bw.append(palabra.toUpperCase() + "\n"); 
                return true;
            }else{ 
                return false;
            }
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean removePalabra(String palabra) {
    if(cargarLista(palabras)==null || cargarLista(palabras).isEmpty() || !cargarLista(palabras).remove(palabra.toUpperCase())){
            return false;
        }else{
            p.delete();
        try {
            p.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(p, true))){
            for(String st : palabras){
                 bw.append(st.toUpperCase() + "\n");
            }                         
  
        } catch (IOException ex) {
            Logger.getLogger(MotorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return true;
        }
    }
    
    public boolean checkPalabra(String txt){
         return txt.length() == 5 && Pattern.compile("[a-zA-Z]{5}").matcher(txt).matches();
    }
    
}
