package org.example;

import java.util.Scanner;

public class AgregarArbol {

    public void nodoDefecto(){
        NodoArbol raiz = new NodoArbol(3);

        NodoArbol nodo1 = new NodoArbol(3);
        NodoArbol nodo2 = new NodoArbol(4);
        raiz.agregarNodo(nodo1);
        raiz.agregarNodo(nodo2);

        NodoArbol nodo3 = new NodoArbol(1);
        NodoArbol nodo4 = new NodoArbol(2);
        nodo1.agregarNodo(nodo3);
        nodo1.agregarNodo(nodo4);

        NodoArbol nodo5 = new NodoArbol(8);
        nodo2.agregarNodo(nodo5);

        NodoArbol nodo6 = new NodoArbol(4);
        NodoArbol nodo7 = new NodoArbol(3);
        nodo3.agregarNodo(nodo6);
        nodo3.agregarNodo(nodo7);

        NodoArbol nodo8 = new NodoArbol(8);
        NodoArbol nodo9 = new NodoArbol(7);
        nodo4.agregarNodo(nodo8);
        nodo4.agregarNodo(nodo9);

        NodoArbol node10 = new NodoArbol(2);
        NodoArbol node11 = new NodoArbol(3);
        NodoArbol node12 = new NodoArbol(5);
        nodo5.agregarNodo(node10);
        nodo5.agregarNodo(node11);
        nodo5.agregarNodo(node12);

        NodoArbol node13 = new NodoArbol(13);
        NodoArbol node14 = new NodoArbol(12);
        NodoArbol node15 = new NodoArbol(15);
        NodoArbol node16 = new NodoArbol(27);
        NodoArbol node17 = new NodoArbol(5);
        NodoArbol node18 = new NodoArbol(3);
        NodoArbol node19 = new NodoArbol(5);
        NodoArbol node20 = new NodoArbol(7);
        NodoArbol node21 = new NodoArbol(2);
        NodoArbol node22 = new NodoArbol(3);
        NodoArbol node23 = new NodoArbol(5);
        NodoArbol node24 = new NodoArbol(2);
        NodoArbol node25 = new NodoArbol(1);

        nodo6.agregarNodo(node13);
        nodo6.agregarNodo(node14);
        nodo7.agregarNodo(node15);
        nodo7.agregarNodo(node16);
        nodo8.agregarNodo(node17);
        nodo8.agregarNodo(node18);
        nodo9.agregarNodo(node19);
        nodo9.agregarNodo(node20);
        node10.agregarNodo(node21);
        node10.agregarNodo(node22);
        node11.agregarNodo(node23);
        node12.agregarNodo(node24);
        node12.agregarNodo(node25);


        int maxSum = ArbolBinario.sumaMaxima(raiz);
        System.out.println("Camino de mayor valor: " + maxSum);

        ArbolBinario.mostrarArbol(raiz, "", true);
    }

    public static NodoArbol createTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del nodo actual:");
        int value = scanner.nextInt();
        NodoArbol root = new NodoArbol(value);

        System.out.println("¿Desea agregar un nodo izquierdo? (S/N)");
        String input = scanner.next().toLowerCase();
        if (input.equals("s")) {
            root.agregarNodo(createTree()); // Llamada recursiva para agregar el nodo izquierdo
        }

        System.out.println("¿Desea agregar un nodo derecho? (S/N)");
        input = scanner.next().toLowerCase();
        if (input.equals("s")) {
            root.agregarNodo(createTree()); // Llamada recursiva para agregar el nodo derecho
        }

        return root;
    }
}
