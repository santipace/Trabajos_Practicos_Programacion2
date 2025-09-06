/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int numero = scanner.nextInt();

        if (numero < 18) {
            System.out.println("Es menor");
        } else if (numero > 18 && numero <= 64) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es adulto mayor");
        }
    }
}
