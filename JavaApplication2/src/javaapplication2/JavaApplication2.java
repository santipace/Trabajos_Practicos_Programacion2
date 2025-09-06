
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anioDeNacimiento, anioActual, sumaEdad;
        
        anioActual = 2025;
        
        System.out.print("Ingrese su año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        
        sumaEdad = anioActual - anioDeNacimiento;
        
        System.out.println("Su edad es: " + sumaEdad);
        
        /* 
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();
        System.out.println("Hola " + nombre);
        */
    }
    
}
