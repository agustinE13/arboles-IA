package org.example;
import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

// Definición de la clase ArbolBinario
class ArbolBinario {

    // Método para calcular la suma máxima de un árbol
    public static int sumaMaxima(NodoArbol raiz) {
        if (raiz == null) {
            return 0; // Si la raíz es nula, la suma máxima es 0
        }

        Stack<NodoArbol> stack = new Stack<>(); // Pila para recorrer el árbol
        Stack<Integer> sumStack = new Stack<>(); // Pila para llevar un seguimiento de la suma actual
        int maxSum = Integer.MIN_VALUE; // Variable para almacenar la suma máxima encontrada

        stack.push(raiz); // Inicializa la pila con la raíz del árbol
        sumStack.push(raiz.val); // Inicializa la pila de suma con el valor de la raíz

        while (!stack.isEmpty()) {
            NodoArbol nodo = stack.pop(); // Obtiene el nodo actual
            int currentSum = sumStack.pop(); // Obtiene la suma actual

            if (nodo.children.isEmpty()) {
                // Nodo hoja, verifica si tiene la suma máxima
                maxSum = Math.max(maxSum, currentSum);
            }

            // Agrega los nodos hijos a la pila para procesarlos
            for (NodoArbol child : nodo.children) {
                stack.push(child);
                sumStack.push(currentSum + child.val); // Actualiza la suma actual con el valor del hijo
            }
        }

        return maxSum; // Devuelve la suma máxima encontrada en el árbol
    }

    // Método para mostrar el árbol en formato de árbol
    public static void mostrarArbol(NodoArbol raiz, String prefix, boolean rama) {
        if (raiz != null) {
            System.out.println(prefix + (rama ? "└── " : "├── ") + raiz.val); // Imprime el valor del nodo con prefijo
            List<NodoArbol> children = raiz.children;
            for (int i = 0; i < children.size() - 1; i++) {
                mostrarArbol(children.get(i), prefix + (rama ? "    " : "│   "), false); // Llama recursivamente para mostrar los hijos
            }
            if (children.size() > 0) {
                mostrarArbol(children.get(children.size() - 1), prefix + (rama ? "    " : "│   "), true); // Llama recursivamente para mostrar el último hijo
            }
        }
    }
}
