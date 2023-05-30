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
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        int num = leer.nextInt();
        
        double raiz = Math.sqrt(num);
        int doble = num*2;
        int triple = num*3;
        System.out.println("Número ingresado "+num+" su doble es "+doble+" su triple es "+triple+" y su raiz cuadrada es "+raiz);
                
    }
    
}
