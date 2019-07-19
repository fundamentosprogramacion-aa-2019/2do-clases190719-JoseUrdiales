/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author Jose Luis
 */
public class Entrenador {
    private String nombre;
    private int edad;
    private String deporte;
    public Entrenador (){
        setNombre("Luis");
        setEdad(20);
        setDeporte("Voley");
    }
    public Entrenador (String n, int e, String d){
        setNombre(n);
        setEdad(e);
        setDeporte(d);
    }
    public void setDeporte(String d){
        deporte = d;
    }
    public void setNombre(String e){
        nombre = e;
    }
    public void setEdad(int e){
        edad = e;
    }
    public String getDeporte(){
        return deporte;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String toString(){
        String cadena = String.format("Entrenador %s - Edad: %d - Deporte: %s", 
                getNombre(), getEdad(), getDeporte());
        return cadena;
    }
}
