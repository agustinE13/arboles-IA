package org.example;

import java.util.ArrayList;
import java.util.List;

class NodoArbol {
    int val;
    List<NodoArbol> children;

    public NodoArbol(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public void agregarNodo(NodoArbol child) {
        children.add(child);
    }
}
