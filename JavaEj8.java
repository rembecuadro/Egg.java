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
public class JavaEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una frase de 8 caracteres");
        String frase = leer.nextLine();
        
        int num = frase.length();
        
        if (num == 8) {
            System.out.println("Correcto, la frase "+frase+" tiene "+num+" letras");
        }else
            System.out.println("Incorrecto, la frase "+frase+" tiene "+num+" letras");
    }
    
}
