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
public class P06AceptacionSolicitud {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int edad;
        float nota;
        char genero;
        
        System.out.print("Ingres su edad: ");
        edad = scan.nextInt();
        
        System.out.print("Ingres su nota: ");
        nota = scan.nextFloat();
        
        System.out.print("Ingrese su genero M o F: ");
        genero= scan.next().toUpperCase().charAt(0);
        
        
        if(edad != 18 || nota != 5 || (genero != 'M' && genero != 'F')){
            System.out.println("Su solicitud no fue aceptada");
        }
        else{
            if(genero == 'M'){
                System.out.println("Su solicitud es posible");
            }
            else{
                System.out.println("Su solicitud fue aceptada");
            }
        }
    }
}
