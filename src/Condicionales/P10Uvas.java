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
public class P10Uvas {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        float precio;
        char tipo;
        char tamano;
        int kilos;
        boolean pass = true;
        
        System.out.println("Ingrese el precio inicial por kilo de uva, en dolares.");
        precio = scan.nextFloat();
        
        System.out.println("Ingrese el tipo de uva que esta vendiendo (A o B).");
        tipo = scan.nextLine().toUpperCase().charAt(0);
        
        System.out.println("Ingrese el tamaño de las uvas que esta vendiendo (1 o 2).");
        tamano = scan.nextLine().charAt(0);
        
        System.out.println("Ingrese cuantos kilos de uva esta vendiendo.");
        kilos = scan.nextInt();
        
        if(tipo == 'A'){
            
            if(tamano == '1'){
                precio = (float) (precio + 0.20);
            }
            else if(tamano == '2'){
                precio = (float) (precio + 0.30);
            }
            else{
                System.out.println("Tamaño de uva no registrado");
                pass = false;
            }
        }
        else if(tipo == 'B'){
            
            if(tamano == '1'){
                precio = (float) (precio - 0.30);
            }
            else if(tamano == '2'){
                precio = (float) (precio - 0.50);
            }
            else{
                System.out.println("Tamaño de uva no registrado");
                pass = false;

            }
        }
        else{
            System.out.println("Tipo de uva no registrado.");
            pass = false;

        }
        
        if(pass){
            System.out.println("Por la venta de las uvas el productor recibira: " + (precio*kilos));
        }
    }
}
