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
public class P02ParImpar {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingres un numero: ");
        numero = scan.nextInt();
        
        if(numero%2 == 0){
            System.out.println("El numero ingresado (" + numero + ") es par");
        }
        else{
            System.out.println("El numero ingresado (" + numero + ") es impar");
        }
    }
}
