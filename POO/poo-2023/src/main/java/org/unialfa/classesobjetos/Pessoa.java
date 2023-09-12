package org.unialfa.classesobjetos;

public class Pessoa {
//Atributos
    private String nome;
    private  String cidade;
//Construtor
    public Pessoa(String name, String city){
        this.nome = name;
        this.cidade = city;

    }
//Metodo
    public void falarNomeECidade(){
        System.out.println(nome + " mora em " + cidade);

    }
}
