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
public class JavaEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una palabra que empiece con la letra A ");
        String pal = leer.nextLine();
        
        String letra = pal.substring(0,1);
        
        if (letra.equals("A")) {
            System.out.println("Correcto. La palabra "+pal+" empieza con la letra "+letra);
        }else
            System.out.println("Incorrecto. La palabra "+pal+" empieza con la letra "+letra);
    }
    
}
