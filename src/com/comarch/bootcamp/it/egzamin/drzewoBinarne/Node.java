package com.comarch.bootcamp.it.egzamin.drzewoBinarne;

public class Node {
    Node prawaStrona;
    Node lewaStrona;
    int wartosc;


    public Node(Node prawaStrona, Node lewaStrona, int wartosc) {
        this.prawaStrona = prawaStrona;
        this.lewaStrona = lewaStrona;
        this.wartosc = wartosc;
    }

    public Node(int wartosc) {
        this.prawaStrona = null;
        this.lewaStrona = null;
        this.wartosc = wartosc;
    }
}