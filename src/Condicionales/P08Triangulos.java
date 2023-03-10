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
public class P08Triangulos {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        double lado1;
        double lado2;
        double base;
        
        System.out.println("Ingrese el tamaño de la base.");
        base = scan.nextDouble();
        
        System.out.println("Ingrese el tamaño de uno de los lados.");
        lado1 = scan.nextDouble();
        
        System.out.println("Ingrese el tamaño del lado faltante.");
        lado2 = scan.nextDouble();
        
        if(lado1 == lado2 && lado1== base){
            System.out.println("El triangulo es equilatero.");
        }
        else if(lado1 == lado2 || lado1 == base || lado2 == base){
            System.out.println("El triangulo es isosceles.");
        }
        else if(lado1 != lado2 && lado1 != base && lado2 != base){
            System.out.println("El triangulo es escaleno.");
        }
        
        if(lado1 == Math.sqrt(Math.pow(base, 2) + Math.pow(lado2, 2)) || lado2 == Math.sqrt(Math.pow(base, 2) + Math.pow(lado1, 2)) || base == Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2))){
            System.out.println("El triangulo es rectangulo.");
        }
    }
    
}
