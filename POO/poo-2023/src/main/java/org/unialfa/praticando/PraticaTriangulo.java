package org.unialfa.praticando;

import java.util.Scanner;

public class PraticaTriangulo {

    public static void main(String[] args) {
        System.out.println("Olá Mundo !!!, Prática de algoritmos");

        float[][] triangulo = new float[4][3];
        float area;
        int i;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            System.out.println("Nos Informe os dados do triangulo " + (i + 1));

            System.out.println("Informe a Base: ");
            triangulo[i][0] = entrada.nextFloat();

            System.out.println("Informe a Altura: ");
            triangulo[i][1] = entrada.nextFloat();
        }
        for (i = 0; i < 4; i++) {
            area = (triangulo[i][0] * triangulo[i][1]) / 2;
            System.out.println("Triangulo" + (i + 1) + "área" + area);
        }
        entrada.close();
    }
}
