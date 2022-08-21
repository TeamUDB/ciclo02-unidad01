
package ciclo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

/**
 *
 * @author rex2002xp
 */
public class MapCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Universidad Don Bosco");
        System.out.println("Ciclo 02 - Programacion Orientada a Objetos");
        System.out.println("-------------------------------------------");
        System.out.println("\n");

        MapCollections caso = new MapCollections();
        caso.getHashMap();
        caso.getTreeMap();
        caso.getLinkedHashMap();

    }

    public void getTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("Utilizando el tipo TreeMap");
        System.out.println("--------------------------");
        System.out.println("\n");

        treeMap.put(1, "Peras");
        treeMap.put(15, "Manzanas");
        treeMap.put(3, "Platanos");
        treeMap.put(5, "Uvas");
        treeMap.put(11, "Fresas");
        treeMap.put(14, "Melocotones");
        treeMap.put(16, "Guineos");
        treeMap.put(8, "Jocotes");
        treeMap.put(18, "Sandillas");
        treeMap.put(6, "Naranjas");
        treeMap.put(7, "Limones");
        
        Iterator<Integer> it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));

        }
        
        System.out.println("\n");
    }

    public void getHashMap() {
        
        System.out.println("Utilizando el tipo HashMap");
        System.out.println("--------------------------");
        System.out.println("\n");

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Peras");
        map.put(15, "Manzanas");
        map.put(3, "Platanos");
        map.put(5, "Uvas");
        map.put(11, "Fresas");
        map.put(14, "Melocotones");
        map.put(16, "Guineos");
        map.put(8, "Jocotes");
        map.put(18, "Sandillas");
        map.put(6, "Naranjas");
        map.put(7, "Limones");
        
        map.keySet().forEach((key) -> {
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        });
        
        System.out.println("\n");
    }

    public void getLinkedHashMap() {
        
        System.out.println("Utilizando el tipo LinkedHashMap");
        System.out.println("--------------------------------");
        System.out.println("\n");
        
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Peras");
        linkedHashMap.put(15, "Manzanas");
        linkedHashMap.put(3, "Platanos");
        linkedHashMap.put(5, "Uvas");
        linkedHashMap.put(11, "Fresas");
        linkedHashMap.put(14, "Melocotones");
        linkedHashMap.put(16, "Guineos");
        linkedHashMap.put(8, "Jocotes");
        linkedHashMap.put(18, "Sandillas");
        linkedHashMap.put(6, "Naranjas");
        linkedHashMap.put(7, "Limones");
        
        int total = linkedHashMap.size();

        Iterator<Integer> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
        
        System.out.println("\n");
    }
}
