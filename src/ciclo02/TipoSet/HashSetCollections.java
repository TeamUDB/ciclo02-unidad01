package ciclo02.TipoSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollections {

    public static void main(String[] args) {
        
        System.out.println("Utilizando HashSet");
        System.out.println("\n");
        
        // Declaración el HashSet
        HashSet<String> lista = new HashSet<>();

        System.out.println("Paso 1 - Poblando el HashSet");
        // Añadimos 10 Elementos en el HashSet
        for (int i = 1; i <= 10; i++) {
            lista.add("Elemento " + i);
        }

        // Declaramos el Iterador e imprimimos los Elementos del HashSet
        System.out.println("Paso 2 - Se recorren el HashSet \n");
        Iterator<String> nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        System.out.println("\n");
        
        System.out.println("Paso 3 - Se intenta agregar un numero elemento llamado Elemento 3");
        System.out.println("         Pero como no permite elementos repetidos siempre mantiene ");
        System.out.println("         la misma cantidad de elemento \n");
        
        // Añadimos un nuevo elemento al HashSet en la posición 2
        lista.add("Elemento 3");
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        // Obtenemos el numero de elementos del HashSet
        int numElementos = lista.size();
        System.out.println("El HashSet tiene " + numElementos + " elementos");
        
        System.out.println("\n");
        
        
        System.out.println("Paso 4 - Eliminamos Elemento 10 del HashSet \n");
        lista.remove("Elemento 10");
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        System.out.print("\n");
        
        
        
        numElementos = lista.size();
        System.out.println("El HashSet tiene " + numElementos + " elementos");
        
    }
}
