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
public class Principal {
    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("Rene", 35);// Se lo deja ahí.
        Entrenador entrenador2 = new Entrenador();
        
        // entrenador1.setNombre("Rene");
        // entrenador1.setEdad(35);
        
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador1.getNombre(), entrenador1.getEdad());
        
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador2.getNombre(), entrenador2.getEdad());
        
        // proceso de cambio de valores
        
        entrenador1.setNombre("Rolando");
        System.out.printf("Nombre %s - Edad %d\n", 
                entrenador1.getNombre(), entrenador1.getEdad());
    }
    
}
