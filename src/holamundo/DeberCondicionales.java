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
public class DeberCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int menú;

        do {
            System.out.println("");
            System.out.println("****************************");
            System.out.println("           MENÚ             ");
            System.out.println("***************************");
            System.out.println("Elija una opcion: ");
            System.out.println("1.- Grupo en base a la edad");
            System.out.println("2.- Numero convertido a texto");
            System.out.println("3.- Finalizar");

            menú = entrada.nextInt();
            switch (menú) {
                case 1:
                    System.out.print("\nIngrese un número: ");
                    int número = entrada.nextInt();

                    if (número <= 2) {
                        System.out.println("Grupo de BEBES");
                    }
                    if (número > 2 && número <= 12) {
                        System.out.println("Grupo de NIÑOS");
                    }
                    if (número > 12 && número <= 18) {
                        System.out.println("Grupo de JOVENES");
                    }
                    if (número > 18 && número <= 65) {
                        System.out.println("Grupo de ADULTOS");
                    } else if (número > 65) {
                        System.out.println("Grupo de ADULTOS MAYORES");
                    }
                    break;

                case 2:
                    System.out.println("\nIngrese un número entre el 1 al 12");
                    int número2 = entrada.nextInt();
                    if (número2 == 1) {
                        System.out.println("ENERO");
                    }
                    if (número2 == 2) {
                        System.out.println("FEBRERO");
                    }
                    if (número2 == 3) {
                        System.out.println("MARZO");
                    }
                    if (número2 == 4) {
                        System.out.println("ABRIL");
                    }
                    if (número2 == 5) {
                        System.out.println("MAYO");
                    }
                    if (número2 == 6) {
                        System.out.println("JUNIO");
                    }
                    if (número2 == 7) {
                        System.out.println("JULIO");
                    }
                    if (número2 == 8) {
                        System.out.println("AGOSTO");
                    }
                    if (número2 == 9) {
                        System.out.println("SEPTIEMBRE");
                    }
                    if (número2 == 10) {
                        System.out.println("OCTUBRE");
                    }
                    if (número2 == 11) {
                        System.out.println("NOVIEMBRE");
                    }
                    if (número2 == 12){
                        System.out.println("DICEIMBRE");
                    }
                    else if (número2 <= 0 || número2 > 12)
                        System.out.println("INCORRECTO, Digite nuevamente");

                    break;

                case 3:
                    System.out.println("ACTIVIDAD FINALIZADA");
                    break;

            }
        } while (menú != 3);

    }

}
