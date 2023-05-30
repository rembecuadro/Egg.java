/*
 *Se realizará un programa que reciba una cadena por teclado y las convierta a mayusculas y a minusculas
 */
package EjercAprendizaje;
import java.util.Scanner;
/**
 *
 * @author rembe
 */
public class MayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba una oración por teclado");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
       String Mayus = frase.toUpperCase();
       String Minus = frase.toLowerCase();
        System.out.println("La frase "+frase+ " convertida en mayusculas ahora es "+Mayus);
        System.out.println("y en minusculas se vería como "+Minus);
    }
    
}
