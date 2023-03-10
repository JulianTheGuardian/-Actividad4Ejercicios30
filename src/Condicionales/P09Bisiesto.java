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
public class P09Bisiesto {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int year;
        
        System.out.println("Ingrese un año.");
        year = scan.nextInt();
        
        if(year%4 == 0){
            System.out.println("El año es bisiesto.");
        }
        else{
            System.out.println("El año no es bisiesto.");
        }
    }
}
