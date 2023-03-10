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
public class P13Dado {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int cara;
        
        System.out.println("Ingrese el numero que salio al tirar el dado.");
        cara = scan.nextInt();
        
        switch (cara){
            case 1:
                System.out.println("La cara opuesta es: 6");
                System.out.println("El numero de letras de la cara opuesta es de: 4");
                break;
                
            case 2:
                System.out.println("La cara opuesta es: 5");
                System.out.println("El numero de letras de la cara opuesta es de: 5");
                break;

                
            case 3:
                System.out.println("La cara opuesta es: 4");
                System.out.println("El numero de letras de la cara opuesta es de: 6");
                break;
                
            case 4:
                System.out.println("La cara opuesta es: 3");
                System.out.println("El numero de letras de la cara opuesta es de: 4");
                break;
                
            case 5:
                System.out.println("La cara opuesta es: 2");
                System.out.println("El numero de letras de la cara opuesta es de: 3");
                break;
                
            case 6:
                System.out.println("La cara opuesta es: 1");
                System.out.println("El numero de letras de la cara opuesta es de: 3");
                break;
            
            default:
                System.out.println("ERROR: Número Incorrecto");
        }
    }
}
