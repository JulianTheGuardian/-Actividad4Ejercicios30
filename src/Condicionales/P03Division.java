/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P03Division {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        double division;
        
        System.out.print("Ingres el dividendo: ");
        numero1 = scan.nextInt();
        
        System.out.print("Ingres el divisor: ");
        numero2 = scan.nextInt();
        
        if(numero2 == 0){
            System.out.println("Error, no se puede dividir entre cero");
        }
        else{
            division = (double) numero1/numero2;
            System.out.println("El resultado de la division (" + numero1 + "/" + numero2 + ") es: " + division);
        }
    }
}
