package com.comarch.bootcamp.it.egzamin.kucharz;

/*
Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek, w drugim P pomarańczy.
Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo.
Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę.
Kucharz ma Z monet.
Napisz program, który na wejściu dostaje trzy liczby:
J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
Przykłady:
Wejście: 1 3 1
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 2
Ilość pomarańczy: 3
Wejście: 5 3 3
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 6
Ilość pomarańczy: 5
Wejście: 1 10 20
Wyjście:
Minimalna różnica: 1
Ilość jabłek: 16
Ilość pomarańczy: 15
 */

import java.util.Scanner;

public class Kucharz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc jablek: ");
        int j = scanner.nextInt();

        System.out.println("Podaj ilosc pomaranczy: ");
        int p = scanner.nextInt();

        System.out.println("Podaj ilosc monet (liczby calkowite): ");
        int z = scanner.nextInt();
        int roznica = Math.abs(j - p);

        int zakupioneJablka = Math.min(j, z);
        int pozostaleMonety = z - zakupioneJablka;
        int zakupionePomarancze = Math.min(p, pozostaleMonety);

        roznica = Math.abs((j - zakupioneJablka) - (p - zakupionePomarancze));

        System.out.println("Minimalna różnica: " + roznica);
        System.out.println("Ilość jabłek: " + (j + zakupioneJablka));
        System.out.println("Ilość pomarańczy: " + (p + zakupionePomarancze));
    }
}