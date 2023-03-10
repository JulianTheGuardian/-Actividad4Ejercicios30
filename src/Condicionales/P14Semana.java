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
public class P14Semana {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int dia;
        
        System.out.println("Ingrese el dia de la semana en el que se encuentra (número)");
        dia = scan.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("Hoy es Lunes");
                break;
                
            case 2:
                System.out.println("Hoy es Martes");
                break;
                
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
                
            case 4:
                System.out.println("Hoy es Jueves");
                break;
                
            case 5:
                System.out.println("Hoy es Viernes");
                break;
                
            case 6:
                System.out.println("Hoy es Sabado");
                break;
                
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            
            default:
                System.out.println("ERROR: Número De La Semana No Reconocido");
        }
    }
}
