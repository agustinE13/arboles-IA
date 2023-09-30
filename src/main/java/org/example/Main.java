package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AgregarArbol def = new AgregarArbol();
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do{
            System.out.println("Que deseas hacer");
            System.out.println("1. Usar arbol por defecto");
            System.out.println("2. Crear arbol");
            System.out.println("3. Salir");
            opc=sc.nextInt();

            switch (opc){
                case 1:
                    def.nodoDefecto();
                    break;
                case 2:
                    NodoArbol root = AgregarArbol.createTree();
                    ArbolBinario.mostrarArbol(root, "", true);
                    ArbolBinario.sumaMaxima(root);
                    break;
            }
            if(opc>3)
                System.out.println("Ingresa una opcion valida");
        }while(opc!=3);

    }
}