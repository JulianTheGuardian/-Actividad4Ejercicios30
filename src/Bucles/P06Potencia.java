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
public class P06Potencia {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double base;
        int expo;
        double pote = 1;
        
        System.out.println("Ingrese el numero base.");
        base = scan.nextDouble();
        
        System.out.println("Ingrese el exponente, debe ser un natural.");
        expo = Math.abs(scan.nextInt());
        
        for (int i = 1; i <= expo; i++) {
            pote = pote * base;
        }
        
        System.out.println("(" + base + ")^" + expo + " = " + pote);
    }
}
