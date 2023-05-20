/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Nalo
 */
public class EjemploPila {
    public static void main(String[] args) {
        // Construcción del nodo inicial
        Nodo inicial = new Nodo(1, null);
        System.out.println("inicial: " + inicial.getElemento());

        // Iniciamos la construcción de la pila
        Pila mipila = new Pila();

        System.out.println(mipila.toString()); // Se muestra el contenido de la pila

        Nodo pvalor = new Nodo(3, null); // Construcción de un nuevo nodo
        Nodo top = mipila.push(inicial, pvalor); // Se inserta el nodo en la pila
        System.out.println("Valor Top: " + top.getElemento());

        top = mipila.push(inicial, new Nodo(78, null));
        System.out.println("Valor Top: " + top.getElemento());

        // Se insertan varios nodos
        top = mipila.push(inicial, new Nodo(23, null));
        System.out.println("******");

        // Se elimina un nodo de la pila
        top = mipila.pop(inicial);

        System.out.println("***Después de borrado***");

        top = mipila.push(inicial, new Nodo(45, null));
        top = mipila.push(inicial, new Nodo(89, null));
        top = mipila.push(inicial, new Nodo(41, null));

        System.out.println(top.toString());

        // Se muestra el nodo en el tope de la pila
        System.out.println("Valor Top: " + mipila.top().toString());
    }
}
