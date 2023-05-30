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
public class JavaEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite una palabra");
        Scanner leer = new Scanner(System.in);
        String pal = leer.next();
        
        String pala = pal.toLowerCase();
        
        if (pala.equals("eureka")) {
            System.out.println("Correcto");
        }
        else
            System.out.println("Incorrecto");
    }
    
}
