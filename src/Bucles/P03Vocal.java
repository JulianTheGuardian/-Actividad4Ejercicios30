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
public class P03Vocal {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        char letraIngresada;
        
        do{
            System.out.println("Ingrese una letra.");
            letraIngresada = scan.nextLine().toUpperCase().charAt(0);
            
            if(letraIngresada == 'A' || letraIngresada == 'E' || letraIngresada == 'I' || letraIngresada == 'O' || letraIngresada == 'U'){
                System.out.println("La letra ingresada es una vocal.");
            }
            else if(letraIngresada == ' '){
                System.out.println("Finalizando el programa.");
                break;
            }
            else{
                System.out.println("La letra ingresada no es una vocal.");
            }
            
        }while(letraIngresada != ' ');
    }
}
