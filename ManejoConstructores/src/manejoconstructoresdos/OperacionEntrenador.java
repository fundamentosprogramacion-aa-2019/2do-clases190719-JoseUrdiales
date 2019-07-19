/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructoresdos;

/**
 *
 * @author Jose Luis
 */
public class OperacionEntrenador {
    private Entrenador [] losEntrenadores;
    double promedioEdades;
    double promedioSalarios;
    
    public OperacionEntrenador(Entrenador [] entrenadores){
        losEntrenadores = entrenadores;
    }
    
    public void establecerLosEntrenadores(Entrenador [] ents){
        losEntrenadores = ents;
    }
    public void establecerPromedioEdades(){
        int suma = 0;
        // for (int i = 0; i < obtenerlosEntrenadores.length; i++) {
        for (int i = 0; i < losEntrenadores.length; i++) {
            suma = suma + losEntrenadores[i].obtenerEdad();
        }
        promedioEdades = (double) suma/losEntrenadores.length;
    }
    public void establecerPromedioSalarios(){
        double salarios = 0;
        // for (int i = 0; i < obtenerlosEntrenadores.length; i++) {
        for (int i = 0; i < losEntrenadores.length; i++) {
            salarios = salarios + losEntrenadores[i].obtenerSalario();
        }
        promedioSalarios = salarios/losEntrenadores.length;
    }
    
    
    public Entrenador [] obtenerLosEntrenadores(){
        return losEntrenadores;
    }
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    public double obtenerPromedioSalarios(){
        return promedioSalarios;
    }
    public String toString(){
        String cadena = String.format("Promedio Edades: %.2f\n"
                + "Promedio Salarios: %.2f\n", 
                obtenerPromedioEdades(), obtenerPromedioSalarios());
        return cadena;
    }
}
