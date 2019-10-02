package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Collections.shuffle;


public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a juagar");
        System.out.println("Cuantas veces vamos a jugar??");
        int veces = teclado.nextInt();
        Integer[] dado = {2,3,4,5,6,7,8,9,10,11,12};
        Random r = new Random();
        int dos =0;
        int tres =0;
        int cuatro =0;
        int cinco =0;
        int seis =0;
        int siete =0;
        int ocho =0;
        int nueve =0;
        int diez =0;
        int once =0;
        int doce =0;

        for (int i = 0; i <veces ; i++) {
            int dadoRandom=r.nextInt(dado.length);

            //System.out.println(dado[dadoRandom]);
            if (dado[dadoRandom].equals(2)){
                dos++;

            } else if (dado[dadoRandom].equals(3)){
                tres++;

            } else if (dado[dadoRandom].equals(4)) {
                cuatro++;
            }else if (dado[dadoRandom].equals(5)){
                cinco++;
            }else if (dado[dadoRandom].equals(6)) {
                seis++;
            }else if (dado[dadoRandom].equals(7)) {
                siete++;
            }
            else if (dado[dadoRandom].equals(8)){
                ocho++;
            }
            else if (dado[dadoRandom].equals(9)) {
                nueve++;
            }else if (dado[dadoRandom].equals(10)) {
                diez++;
            }
            else if (dado[dadoRandom].equals(11)) {
                once++;
            }else if (dado[dadoRandom].equals(12)) {
                doce++;
            }

        }
        System.out.println("Numero 2:");
        System.out.println(dos);
        System.out.println("Numero 3:");
        System.out.println(tres);
        System.out.println("Numero 4:");
        System.out.println(cuatro);
        System.out.println("Numero 5:");
        System.out.println(cinco);
        System.out.println("Numero 6:");
        System.out.println(seis);
        System.out.println("Numero 7:");
        System.out.println(siete);
        System.out.println("Numero 8:");
        System.out.println(ocho);
        System.out.println("Numero 9:");
        System.out.println(nueve);
        System.out.println("Numero 10:");
        System.out.println(diez);
        System.out.println("Numero 11:");
        System.out.println(once);
        System.out.println("Numero 12:");
        System.out.println(doce);



    }
        }



