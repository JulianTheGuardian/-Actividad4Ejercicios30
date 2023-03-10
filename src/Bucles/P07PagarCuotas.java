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
public class P07PagarCuotas {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        float cuotaInicial;
        int nCuotas;
        float total = 0;
        float cuotaActual = 0;
        
        System.out.println("¿Cuanto fue el precio de la primera cuota?");
        cuotaInicial = scan.nextFloat();
        
        System.out.println("¿A cuantas cuotas decidio pagar?");
        nCuotas = scan.nextInt();
        
        cuotaActual = cuotaInicial/2;
        
        for (int i = 1; i <= nCuotas; i++) {
            
            cuotaActual = cuotaActual*2;
            total = total + cuotaActual;
            System.out.println("La cuota " + i + " costo: " + cuotaActual);
        }
        
        System.out.println("En total pago: " + total);
    }
}
