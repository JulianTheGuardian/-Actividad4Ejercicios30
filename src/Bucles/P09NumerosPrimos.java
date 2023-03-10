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
public class P09NumerosPrimos {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nPrimos;
        int num = 2;
        int primos = 0;
        int coincidencias = 0;
        
        System.out.println("Cuantos numeros primos desea ver.");
        nPrimos = scan.nextInt();
        
        do{
            for (int i = 1; i <= num; i++) {
                if(num%i == 0){
                coincidencias++;
                }
            }
            
            
            if(coincidencias == 2) {
                primos++;
                System.out.println(num);
            }
            num++;
            coincidencias = 0;
            
        }while(primos != nPrimos);
    }
}
