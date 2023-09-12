package org.unialfa.atividadepessoa;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cidade;


    public void escreverNomeECidade() {
        System.out.println(nome + " mora em " + cidade);
    }
    public static Pessoa construir() {
        System.out.println("CADASTRO DE PESSOAS !!");
        Pessoa p = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("NOME");
        p.nome = scanner.nextLine();

        System.out.println("CIDADE: ");
        p.cidade = scanner.nextLine();

        System.out.println("SUCESSO!!!");


        return p;


    }
}
