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
public class P02MaximoYMinimo {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = scan.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            
            if(numeros[i] < min){
                min = numeros[i];
            }
            
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            
            if(numeros[i] == min){
                System.out.print(" mínimo");
            }
            
            if(numeros[i] == max){
                System.out.print(" máximo");
            }
            
            System.out.println("");
        }
    }
}
