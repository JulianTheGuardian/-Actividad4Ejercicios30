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
public class P15Mes {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        int mes;
        
        System.out.println("Ingrese un numero entre el 1 y el 12");
        mes = scan.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 dias");
                break;
                
            case 2:
                System.out.println("Febrero tiene 28 dias a menos que sea año viciesto, en ese caso tendra 29 dias");
                break;
                
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
                
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
                
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
                
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
                
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
                
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
                
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
               
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
                
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
                
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;    
            
            default:
                System.out.println("ERROR: Número De Mes Inexistente");
        }
    }
}
