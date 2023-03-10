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
public class P04Mayuscula {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String cadena;
        
        System.out.print("Ingrese una cadena de texto, no se aceptan numeros: ");
        cadena = scan.nextLine();
        
        if(cadena.length() != 1 || cadena.matches("[0-9]+")){
            System.out.println("Ingrese otra cadena, esa no sirve para el programa");
        }
        else{
            if(cadena.charAt(0) == cadena.toUpperCase().charAt(0)){
                System.out.println("La letra ingresada es mayuscula");
            }
            else{
                System.out.println("La letra ingresada es minuscula");
            }
        }
    }
}
