package org.unialfa.atividadenumero;

import org.unialfa.atividadepessoa.Pessoa;

import java.util.Arrays;
import java.util.List;

public class ProgramaNumero {
    public static void main(String[] args) {
        List<Numero> listanumeros = Arrays.asList(Numero.construir(), Numero.construir(), Numero.construir());
        listanumeros.forEach(Numero:: escrevermaior);
    }

}
