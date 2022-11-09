package com.company;

import java.util.Scanner;

public class letraCambiadaS {
    public static void main(String[] args) {
       /* Crear el programa LetraCambiada que recibirá una frase y
        devolverá la frase cambiando el carácter “e” por el carácter “a” y
        mostrará por pantalla una palabra por línea.*/
        Scanner sc = new Scanner(System.in);
        String frase= sc.nextLine();

        String fraseN = frase.replace("e","a");
        String[] palabras = fraseN.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println(); //TIENE QUE DEVOLVER UN SOUT VACIO PORQUE SINO CREA UN NULL EXCEPTION
    }
}