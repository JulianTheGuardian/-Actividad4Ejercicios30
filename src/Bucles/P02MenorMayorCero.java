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
public class P02MenorMayorCero {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nNumeros;
        int nIngresado;
        int menorCero = 0;
        int mayorCero = 0;
        int igualCero = 0;
        
        System.out.println("Ingrese cuantos numeros se van a ingresar.");
        nNumeros = scan.nextInt();
        
        for (int i = 0; i < nNumeros; i++) {
            
            System.out.println("Ingrese un numero.");
            nIngresado = scan.nextInt();
            
            if(nIngresado == 0){
                igualCero++;
            }
            else if(nIngresado > 0){
                mayorCero++;
            }
            else{
                menorCero++;
            }
        }
        
        System.out.println("En total ingreso " + igualCero + " veces el 0.");
        System.out.println("En total ingreso " + menorCero + " numeros menores a 0.");
        System.out.println("En total ingreso " + mayorCero + " numeros mayores a 0.");
    }
}
