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
public class P05Potencia {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int base;
        int exponente;
        
        System.out.print("Ingres el numero base: ");
        base = scan.nextInt();
        
        System.out.print("Ingres el exponente: ");
        exponente = scan.nextInt();
        
        if(exponente > 0){
            System.out.println(base + "^" + exponente + " = " + (int) Math.pow(base, exponente));
        }
        else if(exponente < 0){
            System.out.println(base + "^" + exponente + " = 1/" + (int) Math.pow(base, Math.abs(exponente)));
        }
        else{
            System.out.println(base + "^" + exponente + " = 1");
        }
    }
}
