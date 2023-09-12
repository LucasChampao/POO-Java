package org.unialfa.atividadepessoa;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Arrays.asList(
                Pessoa.construir(),
                Pessoa.construir(),
                Pessoa.construir());
                listaPessoas.forEach(Pessoa :: escreverNomeECidade);

       /* //Instanciar o objeto Pessoa
        Pessoa bob = new Pessoa("Bob", "Umuarama");
        bob.escreverNomeECidade();

        //Criar uma lista de Pessoas vazia
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(bob);
        pessoas.add(new Pessoa("duke", "Umuarama")); // criar nova lista
        pessoas.get(0).escreverNomeECidade(); // puxando bob  "0"
        pessoas.get(1).escreverNomeECidade(); // puxando duke "1"


        //Criar uma lista de Pessoas com valores
        List<Pessoa> lista = Arrays.asList(new Pessoa("João", "Umuarama"),
                new Pessoa("Pedro", "Umuarama"),
                new Pessoa("Tiago", "Umuarama"),
                new Pessoa("André", "Umuarama")
        );


        System.out.println("Exemplo de laço for");
        for (Pessoa o : lista){
            o.escreverNomeECidade();
        }

        System.out.println("Usando expressões lambda - 1");
        lista.forEach(p -> p.escreverNomeECidade());

        System.out.println("Usando expressões lambda - 2");
        lista.forEach(Pessoa :: escreverNomeECidade);*/
    }

}
