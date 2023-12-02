package com.comarch.bootcamp.it.egzamin.drzewoBinarne;
/*
Stwórz drzewo binarne liczb w którym liczby większe są po prawej stronie, a mniejsze po lewej.
Należy stworzyć klasę Tree która posiada referencję do węzła będącego korzeniem.
Do reprezentacji węzła stwórz klasę Node. Klasa Tree powinna mieć metody add(int value),
która dodaje element do drzewa, contains(int value),
która sprawdza czy w drzewie znajduje się dana wartość, max(), która zwraca największą liczbę w
drzewie oraz min(), która zwraca najmniejszą liczbę w drzewie. Klasa Node może zawierać dowolne
metody potrzebne do rozwiązania, można tworzyć dowolną ilość innych klas w ramach potrzeb.
 */
public class App {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(6);
        tree.add(9);

        System.out.println("Najmniejsza wartosc w drzewie:" + tree.min());
        System.out.println("Najwieksza wartosc w drzewie:" + tree.max());
        System.out.println("Czy występuje wartosc 1" + tree.contains(1));
    }
}
