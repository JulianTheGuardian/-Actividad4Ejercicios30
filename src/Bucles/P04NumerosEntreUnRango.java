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
public class P04NumerosEntreUnRango {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nMax;
        int nMin;
        
        System.out.println("Ingrese un numero.");
        nMax = scan.nextInt();
        
        System.out.println("Ingrese otro numero.");
        nMin = scan.nextInt();
        
        if(nMax < nMin){
            nMax =  nMax + nMin;
            nMin = nMax - nMin;
            nMax = nMax - nMin;
        }
        
        System.out.println("\nLos numeros que se encuentran entre los 2 numeors ingresados son:");
        
        for (int i = nMin; i <= nMax; i++) {
            System.out.print(i);
        }
               
    }
}
