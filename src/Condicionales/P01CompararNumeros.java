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
public class P01CompararNumeros {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.print("Ingres un numero: ");
        numero1 = scan.nextInt();
        
        System.out.print("Ingres otro numero: ");
        numero2 = scan.nextInt();
        
        if(numero1 > numero2){
            System.out.println("El numero 1 es mayor al numero 2: " + numero1 + " > " + numero2);
        }
        else if(numero1 < numero2){
            System.out.println("El numero 1 es menor al numero 2: " + numero1 + " < " + numero2);
        }
        else{
            System.out.println("El numero 1 es igual al numero 2: " + numero1 + " = " + numero2);
        }
    }
}
