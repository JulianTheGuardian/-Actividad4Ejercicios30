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
public class P10PiramideNumeros {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int filas;
        int filasPasadas = 0;
        
        System.out.println("Ingrese el numero de filas que desea que tenga la piramide.");
        filas = scan.nextInt();
        
        for (int i = 0; i <= filas-1; i++) {
            
            for (int j = 0; j < filas-filasPasadas; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= filasPasadas+1; k++) {
                System.out.print(k + " ");
            }
            
            for (int l = filasPasadas; l > 0; l--) {
                System.out.print(l + " ");
            }
            filasPasadas++;
            System.out.println("");
        }
            
    }
}
