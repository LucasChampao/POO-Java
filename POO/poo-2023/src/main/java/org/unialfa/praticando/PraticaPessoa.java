package org.unialfa.praticando;

import java.util.Scanner;

public class PraticaPessoa {
    public static void main(String[] args) {
    String[][] pessoa = new String[5][3];

        Scanner entr = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println(" Digite o nome : ");
            pessoa[i][0] = entr.nextLine();

            System.out.println(" Digite cidade: ");
            pessoa[i][1] = entr.nextLine();
        }
        for (int i = 0; i < 5; i++){
            System.out.println(pessoa[i][0] + " mora em: " + pessoa[i][1]);
        }
        entr.close();
    }
}
