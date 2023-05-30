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
public class suma {
    public static void main(String[] args) {
    int num1;
    int num2;
    int num3;
    
        System.out.println("Digite el primer número");
        Scanner leer = new Scanner(System.in);  
        num1 = leer.nextInt();
        
        System.out.println("Digite el segundo número");
        //Scanner leer = new Scanner(System.in);  
        num2 = leer.nextInt();
        
        num3 = num1 + num2;
        
        System.out.println("El resultado de la suma de "+num1+" + "+num2+" es "+ num3);
        
    }
    
}
