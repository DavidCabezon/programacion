/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Introduce un numero que corresponde al dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduce un numero que corresponde al mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce un numero que corresponde al año: ");
        int año = sc.nextInt();

        String mesletra = "";
        switch (mes) {
            case 1:
                mesletra = "enero";
                break;
            case 2:
                mesletra = "febrero";
                break;
            case 3:
                mesletra = "marzo";
                break;
            case 4:
                mesletra = "abril";
                break;
            case 5:
                mesletra = "mayo";
                break;
            case 6:
                mesletra = "junio";
                break;
            case 7:
                mesletra = "julio";
                break;
            case 8:
                mesletra = "agosto";
                break;
            case 9:
                mesletra = "septiembre";
                break;
            case 10:
                mesletra = "octubre";
                break;
            case 11:
                mesletra = "noviembre";
                break;
            case 12:
                mesletra = "diciembre";
                break;
        }
        if (año < 2000 || año > 2050) {
            System.out.println("Año fuera del rango permitido ");
        } else if (mes > 12 || mes < 1) {
            System.out.println("Error la fecha no es correcta.");
        } else if (dia > 31 || dia < 1) {
            System.out.println("Error la fecha no es correcta.");
        } else if (mes == 2 && dia == 29) {
            if ((año % 400 == 0) && (año % 4 == 0)) {
                System.out.println(dia + " de " + mesletra + " del " + año + " (" + año + " fue bisiesto)");
            } else if (año % 4 == 0) {
                System.out.println(dia + " de " + mesletra + " del " + año + " (" + año + " fue bisiesto)");
            } else {
                System.out.println("Error la fecha no es correcta. (febrero no fue bisiesto en el " + año + ")");
            }
        } else {
            if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                System.out.println("Error la fecha no es correcta. (ese mes no tiene 31 dias)");
            } else if (mes == 2 && dia > 29) {
                System.out.println("Error la fecha no es correcta. (Ese mes tiene solo 29 dias como máximo)");
            } else {
                System.out.println(dia + " de " + mesletra + " del " + año);
            }
        }
    }
}
