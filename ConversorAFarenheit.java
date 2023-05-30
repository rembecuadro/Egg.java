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
public class ConversorAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el valor de grados centigrados");
        int grados = leer.nextInt();
        
        double far = 32 + ((9*grados)/5);
        
        System.out.println(grados+" grados centigrados son "+far+" Farenheit");
    }
    
}
