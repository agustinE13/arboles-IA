package org.example;
import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

class ArbolBinario {
    public static int sumaMaxima(NodoArbol raiz) {
        if (raiz == null) {
            return 0;
        }

        Stack<NodoArbol> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        int maxSum = Integer.MIN_VALUE;

        stack.push(raiz);
        sumStack.push(raiz.val);

        while (!stack.isEmpty()) {
            NodoArbol nodo = stack.pop();
            int currentSum = sumStack.pop();

            if (nodo.children.isEmpty()) {
                // Leaf node, check if it has the maximum sum
                maxSum = Math.max(maxSum, currentSum);
            }

            for (NodoArbol child : nodo.children) {
                stack.push(child);
                sumStack.push(currentSum + child.val);
            }
        }

        return maxSum;
    }

    public static void mostrarArbol(NodoArbol raiz, String prefix, boolean rama) {
        if (raiz != null) {
            System.out.println(prefix + (rama ? "└── " : "├── ") + raiz.val);
            List<NodoArbol> children = raiz.children;
            for (int i = 0; i < children.size() - 1; i++) {
                mostrarArbol(children.get(i), prefix + (rama ? "    " : "│   "), false);
            }
            if (children.size() > 0) {
                mostrarArbol(children.get(children.size() - 1), prefix + (rama ? "    " : "│   "), true);
            }
        }
    }

}