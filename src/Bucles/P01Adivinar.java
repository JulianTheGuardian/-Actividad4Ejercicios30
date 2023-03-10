/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P01Adivinar {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nAdivinar;
        int nIngresado;
        int intentos = 0;
        boolean acerto = false;
        
        nAdivinar = (int) (Math.random() * (100-1) + 1);
        
        while(intentos < 10){
            System.out.println("\nIngrese un numero entero");
            nIngresado = scan.nextInt();
            
            if(nAdivinar == nIngresado){
                System.out.println("Numero adivinado en " + (intentos+1) + " intentos");
                acerto = true;
                break;
            }
            else if(nIngresado > nAdivinar){
                System.out.println("El numero ingresado es mayor al numero a adivinar");
                System.out.println("Intentos restantes: " + (9-intentos));
                intentos++;
            }
            else{
                System.out.println("El numero ingresado es menor al numero a adivinar");    
                System.out.println("Intentos restantes: " + (9-intentos));
                intentos++;
            }
        }
        
        if(!acerto){
            System.out.println("\nFallaste en adivinar el numero.");
            System.out.println("El nuemro era: " + nAdivinar);
        }
    }
}
