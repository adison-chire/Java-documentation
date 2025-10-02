package com.adisonchire.proyectos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // controlDeFlujo();
        // bucleFor();
        bucleWhile();
        
    }

    public static void controlDeFlujo() {
        // variables
        int edad = 18;
        String nombre = "Adison";
        double altura = 1.75; 

        //Clase Scanner para entrada de edad
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();
        System.out.print("Ingresa tu altura: ");
        altura = sc.nextDouble();

        if (edad >= 18) {
            if (altura >= 1.75) {
                System.out.println("Eres un adulto alto. ¡Bienvenido " + nombre + "!");
            } else {
                System.out.println("Eres un adulto, pero no muy alto. ¡Bienvenido " + nombre + "!");
            }
        } else {
            System.out.println("Eres menor de edad. Solo puedes ver " + nombre + "!");
        }
    }

    public static void bucleFor() {
        System.out.println("\nNúmeros pares del 0 al 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void bucleWhile() {
        Scanner sc = new Scanner(System.in);
        int numero = 10;

        while (numero != 0) {
            //cuenta regresiva
            System.out.print(numero + " ");
            numero -= 1;
            
        }

        System.out.println("Lanzamiento.");
    }    
}

