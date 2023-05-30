/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercAprendizaje;

import java.util.Scanner;

/**
 *
 * @author rembe
 */
public class nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        System.out.println("Por favor, digita tu nombre");
        Scanner leer = new Scanner(System.in);
        nombre = leer.next();
        System.out.println("Y ahora digita tu edad");
        edad = leer.nextInt();
        
        System.out.println("Hola "+nombre+" tienes "+edad+" años");
       
    }
    
}
