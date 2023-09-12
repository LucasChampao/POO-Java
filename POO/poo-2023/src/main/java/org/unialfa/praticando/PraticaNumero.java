package org.unialfa.praticando;

import java.util.Scanner;

public class PraticaNumero {
    public static void main(String[] args) {
        int[] numero = new int[5];
        int maior = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            do {
                System.out.println("Informe um Número: ");
            } while (numero[i] < 0);

            if (numero[i] > maior) {
                maior = numero[i];
            }
        }
        System.out.println(" Maior Número é: " + maior);
        scanner.close();
    }
}
