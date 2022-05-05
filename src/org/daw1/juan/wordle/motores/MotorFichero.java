/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;
import org.daw1.juan.wordle.motores.*;
/**
 *
 * @author alumno
 */
public class MotorFichero implements IMotor {
    
    GestorMotor gm = new GestorMotor();

    @Override
    public boolean checkPalabra(String palabra) {
        return palabra.length() == 5;
    }

    //DEVERIA VOLVER UN ARRAY CON LAS POSICIONES DE LAS LETRAS DE LA PALABRA???
    @Override
    public String obtenerPalabraAleatoria() {
        return "wds";
    }

    //CREAR UNA CLASE QUE MANEJE LAS PALABRAS?
    @Override
    public boolean addPalabra(String palabra) {
        return true;
//       if(checkPalabra(palabra)){
//           if(!gm.existeFichero()){
//               try{
//                   gm.
//               }
//           }
//       }
    }

    @Override
    public boolean removePalabra(String palabra) {
        return true;
    }
    
}
