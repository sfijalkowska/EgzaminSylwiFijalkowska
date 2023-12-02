package com.comarch.bootcamp.it.egzamin.drzewoBinarne;

public class Tree {
    private Node korzenDrzewa;

    public Tree() {
        this.korzenDrzewa = null;
    }

    public void add(int wartosc) {
        korzenDrzewa = add2(korzenDrzewa, wartosc);
    }

    private Node add2(Node aktualna, int wartosc) {
        if (aktualna == null) {
            return new Node(wartosc);
        }
        if (wartosc > aktualna.wartosc) {
            aktualna.prawaStrona = add2(aktualna.prawaStrona, wartosc);
        } else {
            aktualna.lewaStrona = add2(aktualna.lewaStrona, wartosc);
        }
        return aktualna;
    }

    public boolean contains(int wartosc) {
        return contains2(korzenDrzewa, wartosc);
    }

    private boolean contains2(Node aktualna, int wartosc) {
        if (aktualna == null) {
            return false;
        } else if (wartosc == aktualna.wartosc) {
            return true;
        } else {
            return wartosc < aktualna.wartosc ?
                    contains2(aktualna.lewaStrona, wartosc) : contains2(aktualna.prawaStrona, wartosc);
        }
    }

    public int max() {
        if (korzenDrzewa == null) {
            return 0;
        }
        Node node = korzenDrzewa;
        while (node.prawaStrona != null) {
            node = node.prawaStrona;
        }
        return node.wartosc;
    }

    public int min() {
        if (korzenDrzewa == null) {
            return 0;
        }
        Node node = korzenDrzewa;
        while (node.lewaStrona != null) {
            node = node.lewaStrona;
        }
        return node.wartosc;
    }
}