
package javaapp;

import java.util.Scanner;

public class DivisionDouble {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        double resultado = num1 / num2;
        System.out.println("Resultado de la division: " + resultado);
        
        scanner.close();
    }
    
}
