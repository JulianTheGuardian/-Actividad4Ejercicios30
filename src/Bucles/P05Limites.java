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
public class P05Limites {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int nMin;
        int nMax;
        int nIngre;
        int fueraInter = 0;
        int sumaInter = 0;
        boolean igualInter = false;
        
        do{
            System.out.println("Ingrese el limite superior del intervalo.");
            nMax = scan.nextInt();
            
            System.out.println("Ingrese el limite ingerior del intervalo.");
            nMin = scan.nextInt();
            
            if(nMin>nMax){
                System.out.println("Se le volveran a pedir los limites debido a que no siguio las instrucciones.");
            }
            
        }while(nMin>nMax);
        
        do{
            System.out.println("Ingrese un numero, si ingresa el 0 el programa finalizara.");
            nIngre = scan.nextInt();
            
            if(nIngre == nMax || nIngre == nMin){
                igualInter = true;
            }
            else if(nIngre == 0){
                break;
            }
            else if(nIngre < nMin || nIngre > nMax){
                fueraInter++;
            }
            else{
                sumaInter = sumaInter + nIngre;
            }
            
        }while(nIngre != 0);
        
        System.out.println("La suma de los numeros ingresados que estan dentro del intervalo es de: " + sumaInter);
        System.out.println("La cantidad de numeros ingresados fuera del intervalo es de: " + fueraInter);
        
        if(igualInter){
            System.out.println("Ingreso al menos un numero igual a uno de los limites del intervalo.");
        }
        else{
            System.out.println("No ingreso ningun numero igual a uno de los limites del intervalo.");
            
        }
    }
}
