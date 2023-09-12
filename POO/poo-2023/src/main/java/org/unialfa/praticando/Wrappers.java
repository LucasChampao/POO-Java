package org.unialfa.praticando;

import java.awt.desktop.SystemEventListener;
import java.security.KeyStore;

public class Wrappers {
    public static void main(String[] args) {
        byte bytep = 127;
        short shortp = 32767;
        int intp = 2147483647;
        long longp = 2147483647L;
        float floatp = 5.5F;
        double doublep = 5.5555D;
        char charp = 'a';
        boolean booleanp = true;

        Byte byteW = 127;
        Short shortW = 32767;
        Integer intW = 2147483647;
        Long longW = 2147483647L;
        Float floatW = 5.5F;
        Double doubleW = 5.5555D;
        Character charW = 'a';
        Boolean booleanW = true;

        Byte grupo1 = new Byte((byte) 127);
        System.out.println("Byte é: " + grupo1);

        Short grupo2 = new Short((short) 32767);
        System.out.println("Short é: " + grupo2);

        Integer grupo3 = new Integer((int) 2147483647);
        System.out.println("Integer é: " + grupo3);

        Long grupo4 = new Long((long) 2147483647L);
        System.out.println("Long é: " + grupo4);

        Float grupo5 = new Float((float) 5.5F);
        System.out.println("Float é: " + grupo5);

        Double grupo6 = new Double((double) 5.5555D);
        System.out.println("Double é: " + grupo6);

        Character grupo7 = new Character('a');
        System.out.println("Character é: " + grupo7);

        Boolean grupo8 = new Boolean(true);
        System.out.println("Boolean é: " + grupo8);

        // TRATAMENTO DE VALORES NULOS
        Integer lucas = null;
        if (lucas == null) {
            System.out.println(" O Lucas está ausente. ");
        } else {
            System.out.println(" O Lucas Está Presente !! ");
        }