/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author Alex Zumba
 */
public class Repeticiones {
    
    public static void main(String [] args){
        
        int contador = 1;
        int numero = 8;
        // Bucle While
        while(contador <= 12){
            int resultado = numero * contador;
            System.out.println(numero +" * "+ contador + " = " + resultado);
            contador ++;
        }
        
        // Bucle Do-While
        System.out.println("Do-While");
        
        int cont = 1;
        do{
            int resultado = numero * cont;
            System.out.println(numero +" * "+ cont + " = " + resultado);
            cont += 1;
        } while(cont < 1);
        
        // Bucle For
        System.out.println("Bucle For");
        for (int cont1 = 1; cont1 <= 12; cont1 ++) {
            int resultado = numero * cont1;
            System.out.println(numero +" * "+ cont1 + " = " + resultado);
            
        }
    }
}
