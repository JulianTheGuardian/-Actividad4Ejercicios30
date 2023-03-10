/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P03SumaColumnasYFilas {
     
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int sumaFilas = 0;
        int sumaTotal = 0;
        int sumaCol = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese un numero.");
                numeros[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + numeros[i][j] + "] ");
                sumaFilas = sumaFilas + numeros[i][j];
                sumaTotal = sumaTotal + numeros[i][j];
            }
            System.out.println(" " + sumaFilas);
            sumaFilas = 0;
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                sumaCol = sumaCol + numeros[j][i];
            }
            System.out.print(" " + sumaCol + " ");
            sumaCol = 0;
        }
        
        System.out.println(" " + sumaTotal);   
    }
}
