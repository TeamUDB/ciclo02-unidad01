package ciclo02;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCollections {

    public static void main(String[] args) {
        
        System.out.println("Utilizando ArrayList");
        System.out.println("\n");
        
        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<>();

        System.out.println("Paso 1 - Poblando el ArrayList");
        // Añadimos 10 Elementos en el ArrayList
        for (int i = 1; i <= 10; i++) {
            nombreArrayList.add("Elemento " + i);
        }

        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        System.out.println("Paso 2 - Se recorren el ArrayList \n");
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        System.out.println("\n");
        
        System.out.println("Paso 3 - Se agrega un elemento nuevo en la posicion 5 \n");
        
        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(5, "Elemento 3");
        
        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        // Obtenemos el numero de elementos del ArrayList
        int numElementos = nombreArrayList.size();
        System.out.println("El ArrayList tiene " + numElementos + " elementos");
        
        System.out.println("\n");
        
        
        System.out.println("Paso 4 - Eliminamos el primer elemento del ArrayList \n");
        nombreArrayList.remove(0);
        
        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        System.out.print("\n");
        
        System.out.println("Paso 5 - Eliminamos los elementos de ArrayList que sean iguales a Elemento 3 \n");

        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            if (elemento.equals("Elemento 3")) {
                nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
            }
        }
        
        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        numElementos = nombreArrayList.size();
        System.out.println("El ArrayList tiene " + numElementos + " elementos");

    }
}
