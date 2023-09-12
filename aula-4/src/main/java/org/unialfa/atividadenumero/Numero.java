package org.unialfa.atividadenumero;

import java.util.Scanner;

public class Numero {
    private int numero = 5;
    private int maior = 0;

    public void escrevermaior() {
        System.out.println(" o Maior Número é: " + maior);
    }

    public static Numero construir() {
        System.out.println("===========");
        Numero numeroObjetc = new Numero();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Informe um número");
            numeroObjetc.numero = scanner.nextInt();

            System.out.println("SUCESSO !!");
        } while (numeroObjetc.numero < 0);

        if (numeroObjetc.numero > numeroObjetc.maior) {
            numeroObjetc.maior = numeroObjetc.numero;
        }
        return numeroObjetc;
    }
}
