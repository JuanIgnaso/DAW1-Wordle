/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.juan.wordle.motores;

/**
 *
 * @author alumno
 */
public class MotorTest implements IMotor {

    @Override
    public boolean checkPalabra(String palabra) {
        return true;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "CICLO";
    }

    @Override
    public boolean addPalabra(String palabra) {
        return true;
    }

    @Override
    public boolean removePalabra(String palabra) {
        return true;
    }
    
}
