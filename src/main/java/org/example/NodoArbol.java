package org.example;

import java.util.ArrayList;
import java.util.List;

// Definición de la clase NodoArbol
class NodoArbol {
    int val;                 // Valor almacenado en el nodo
    List<NodoArbol> children; // Lista de nodos hijos

    // Constructor de la clase que recibe un valor para inicializar el nodo
    public NodoArbol(int val) {
        this.val = val;         // Asigna el valor proporcionado al nodo
        this.children = new ArrayList<>(); // Inicializa la lista de hijos como una lista vacía
    }

    // Método para agregar un nodo hijo al nodo actual
    public void agregarNodo(NodoArbol child) {
        children.add(child); // Agrega el nodo child a la lista de hijos del nodo actual
    }
}

