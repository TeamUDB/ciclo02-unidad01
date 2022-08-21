package ciclo02.Colecciones;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections {

    public static void main(String[] args) {
        
        System.out.println("Utilizando LinkedList");
        System.out.println("\n");
        
        // Declaración el ArrayList
        LinkedList<String> lista = new LinkedList<>();

        System.out.println("Paso 1 - Poblando el LinkedList");
        // Añadimos 10 Elementos en el LinkedList
        for (int i = 1; i <= 10; i++) {
            lista.add("Elemento " + i);
        }

        // Declaramos el Iterador e imprimimos los Elementos del LinkedList
        System.out.println("Paso 2 - Se recorren el LinkedList \n");
        Iterator<String> nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        System.out.println("\n");
        
        System.out.println("Paso 3 - Se agrega un elemento nuevo en la posicion 5 \n");
        
        // Añadimos un nuevo elemento al LinkedList en la posición 2
        lista.add(5, "Elemento 3");
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        // Obtenemos el numero de elementos del LinkedList
        int numElementos = lista.size();
        System.out.println("El LinkedList tiene " + numElementos + " elementos");
        
        System.out.println("\n");
        
        
        System.out.println("Paso 4 - Eliminamos el primer elemento del LinkedList \n");
        lista.remove(0);
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        System.out.print("\n");
        
        System.out.println("Paso 5 - Eliminamos los elementos de LinkedList que sean iguales a Elemento 3 \n");

        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            if (elemento.equals("Elemento 3")) {
                nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
            }
        }
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        numElementos = lista.size();
        System.out.println("El ArrayList tiene " + numElementos + " elementos");
        
        System.out.print("\n");
        
        System.out.println("Paso 6 - Se obtiene el primer elemento y el ultimo \n");
        
        System.out.print("Primer Elemento => " + lista.getFirst() + "\n");
        System.out.print("Ultimo Elemento => " + lista.getLast()+ "\n"); 
        


    }
}
