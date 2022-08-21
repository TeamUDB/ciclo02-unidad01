package ciclo02.TipoSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetCollections {
    
    enum Color {
            RED, YELLOW, GREEN, BLUE, BLACK, WHITE
        }

    public static void main(String[] args) {
        
        System.out.println("Utilizando EnumSet");
        System.out.println("\n");
        
        
        
        // Declaración el EnumSet
        System.out.println("Paso 1 - Poblando el EnumSet");
        EnumSet<Color> lista = EnumSet.allOf(Color.class);

        // Declaramos el Iterador e imprimimos los Elementos del EnumSet
        System.out.println("Paso 2 - Se recorren el EnumSet \n");
        Iterator<Color> nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            Color elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        System.out.println("\n");
        
        System.out.println("Paso 3 - Se intenta agregar un numero elemento llamado BLACK");
        System.out.println("         Pero como no permite elementos repetidos siempre mantiene ");
        System.out.println("         la misma cantidad de elemento \n");
        
        // Añadimos un nuevo elemento al EnumSet en la posición 2
        lista.add(Color.BLACK);
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            Color elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        // Obtenemos el numero de elementos del EnumSet
        int numElementos = lista.size();
        System.out.println("El EnumSet tiene " + numElementos + " elementos");
        
        System.out.println("\n");
        
        
        System.out.println("Paso 4 - Eliminamo elemento BLACK del EnumSet \n");
        lista.remove(Color.BLACK);
        
        nombreIterator = lista.iterator();
        while (nombreIterator.hasNext()) {
            Color elemento = nombreIterator.next();
            System.out.print(elemento + "\n");
        }
        
        System.out.print("\n");
        
        numElementos = lista.size();
        System.out.println("El EnumSet tiene " + numElementos + " elementos");
        
    }
}
