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
public class ParImpar {
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        System.out.println("Digite un número");
        int num = (int) (Math.random()*1000);
        
        if (num % 2 == 0) {
            System.out.println("El número "+num+" es par");
        }
            else
            System.out.println("El número "+num+" es impar");
         
    }
  
}
