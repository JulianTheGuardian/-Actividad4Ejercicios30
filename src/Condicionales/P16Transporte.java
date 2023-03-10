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
public class P16Transporte {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        float peso;
        int ubicacion;
        float costo;
        
        System.out.println("Ingrese el peso del paquete (kg).");
        peso = scan.nextFloat();
        
        System.out.println("Seleccione el numero que corresponde a la región a donde se dirige el paquete.");
        System.out.println("1. América del Norte");
        System.out.println("2. América Central");
        System.out.println("3. América del Sur");
        System.out.println("4. Europa");
        System.out.println("5. Asia");
        ubicacion = scan.nextInt();

        if(peso>5){
            System.out.println("Paquete rechazado: Peso mayor al aceptado.");
        }
        else{
            switch (ubicacion){
                case 1:
                    costo = peso*24;
                    System.out.println("Entregar este paquete cuesta: " + costo + " euros.");
                    break;
                    
                case 2:
                    costo = peso*20;
                    System.out.println("Entregar este paquete cuesta: " + costo + " euros.");
                    break;
                    
                case 3:
                    costo = peso*21;
                    System.out.println("Entregar este paquete cuesta: " + costo + " euros.");
                    break;
                    
                case 4:
                    costo = peso*10;
                    System.out.println("Entregar este paquete cuesta: " + costo + " euros.");                    
                    break;
                    
                case 5:
                    costo = peso*18;
                    System.out.println("Entregar este paquete cuesta: " + costo + " euros.");
                    break;
                    
                default:
                    System.out.println("Paquete rechazado: Region no reconocida.");
                    
            }
        }
    }
}
