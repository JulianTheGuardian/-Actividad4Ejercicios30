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
public class P11ViajeEstudios {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nAlumnos;
        double precio;
        double costeAlum;
        
        System.out.println("Ingrese el numero de alumnos que iran al viaje.");
        nAlumnos = scan.nextInt();
        
        if(nAlumnos >= 100){
            System.out.println("Cada alumno debe de pagar 65 euros");
            precio = nAlumnos*65;
            System.out.print("El pago que recibe la compañia de autobuses es de: " + precio + " euros.");
        }
        else if(50<=nAlumnos && nAlumnos<=99){
            System.out.println("Cada alumno debe de pagar 70 euros");
            precio = nAlumnos*70;
            System.out.print("El pago que recibe la compañia de autobuses es de " + precio + " euros.");
        }
        else if(30<=nAlumnos && nAlumnos<=49){
            System.out.println("Cada alumno debe de pagar 95 euros");
            precio = nAlumnos*95;
            System.out.print("El pago que recibe la compañia de autobuses es de: " + precio + " euros.");
        }
        else{
            costeAlum = 4000/nAlumnos;
            System.out.println("Cada alumno debe de pagar " + costeAlum + " euros");
            System.out.print("El pago que recibe la compañia de autobuses es de 4000 euros." );
        }
    }
}
