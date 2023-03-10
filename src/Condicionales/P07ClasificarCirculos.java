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
public class P07ClasificarCirculos {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        int radio1;
        int radio2;
        double distancia;
        
        System.out.print("Ingrese el componente en X del primer circulo: ");
        x1 = scan.nextInt();
        
        System.out.print("Ingrese el componente en Y del primer circulo: ");
        y1 = scan.nextInt();
        
        System.out.print("Ingrese el radio del primer circulo: ");
        radio1 = Math.abs(scan.nextInt());
        
        System.out.print("Ingrese el componente en X del segundo circulo: ");
        x2 = scan.nextInt();
        
        System.out.print("Ingrese el componente en Y del segundo circulo: ");
        y2 = scan.nextInt();
        
        System.out.print("Ingrese el radio del segundo circulo: ");
        radio2 = Math.abs(scan.nextInt());
        
        distancia = Math.sqrt(Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2)));
        
        if(distancia > (radio1+radio2)){
            System.out.println("Los circulos son exteriores");
        }
        else if(distancia == (radio1+radio2)){
            System.out.println("Los circulos son tangentes exteriores");
        }
        else if(distancia < (radio1+radio2) && distancia > Math.abs(radio1-radio2)){
            System.out.println("Los circulos son secantes");
        }
        else if(distancia > 0 && distancia < (Math.abs(radio1-radio2))){
            System.out.println("Los circulos son interiores");
        }
        else if(distancia == Math.abs(radio1-radio2)){
            System.out.println("Los circulos son tangentes interiores");
        }
        else if(distancia == 0){
            System.out.println("Los circulos son concentricos");
        }
    }
}
