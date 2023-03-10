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
public class P01OrdenInverso {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 9; i >= 0; i--) {
            System.out.println("Ingrese un numero");
            numeros[i] = scan.nextInt();
        }
        
        System.out.print("\nLos numeros ingresados en reversa son: ");
        
        for(int num: numeros){
            System.out.print(num + " "); 
        }
    }
}
