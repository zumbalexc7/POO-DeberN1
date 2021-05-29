/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Alex Zumba
 */
public class DeberSerieFibonacci {
    
    public static void main(String [] args){
        
        // Serie Fibonacci
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos a generar");
        int Numero = entrada.nextInt();
        
        int num1 = 0;
        int num2 = 1;        
        int contador = 2;
        int auxiliar;
        
        //Bucle While
        System.out.println("\n Serie Fibonacci, con el bucle WHILE: ");
        System.out.println("Elemento #1: " + num1);
        System.out.println("Elemento #2: " + num2);
        while (contador < Numero){
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar + num1;
            
            contador ++;
            
            System.out.println("Elemento #"+ contador+ ": "+num2);
        
    }
        
        //Bucle Do-While
        System.out.println("\n Serie Fibonacci, con el bucle DO-WHILE: ");
        
        int num3 = 0;
        int num4 = 1; 
        int contador1 = 2;
        int auxiliar1;
        
        System.out.println("Elemento #1: " + num3);
        System.out.println("Elemento #2: " + num4);
   
        
        do{
            
            
            auxiliar1 = num3;
            num3 = num4;
            num4 = auxiliar1 + num3;
            
            contador1 ++;
            
            System.out.println("Elemento #"+ contador1+ ": "+num4);
        } while(contador1 < Numero);
        
        //Bucle For
        System.out.println("\n Serie Fibonacci, con el bucle FOR: ");
        
        int num5 = 0;
        int num6 = 1; 
        int auxiliar2;
        
        System.out.println("Elemento #1: " + num5);
        System.out.println("Elemento #2: " + num6);
        for (int contador2 = 3; contador2 <= Numero; contador2++) {
            
            auxiliar2 = num5;
            num5 = num6;
            num6 = auxiliar2 + num5;           
            
            System.out.println("Elemento #"+ contador2+ ": "+num6);
        }
    }
}
