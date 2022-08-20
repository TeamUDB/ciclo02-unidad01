/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Unidad01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Unidad01 caso = new Unidad01();
        caso.getHashMap();
        System.out.println("");
        caso.getTreeMap();
        System.out.println("");
        caso.getLinkedHashMap();

    }

    public void getTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("Ejemplo con TreeMap");
        System.out.println("");

        treeMap.put(1, "Casillas");
        treeMap.put(15, "Ramos");
        treeMap.put(3, "Pique");
        treeMap.put(5, "Puyol");
        treeMap.put(11, "Capdevila");
        treeMap.put(14, "Xabi Alonso");
        treeMap.put(16, "Busquets");
        treeMap.put(8, "Xavi Hernandez");
        treeMap.put(18, "Pedrito");
        treeMap.put(6, "Iniesta");
        treeMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        Iterator<Integer> it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));

        }
    }

    public void getHashMap() {
        // El HashMap no permite valores duplicados ni permite valores nulos.
        // Tampoco garantiza un orden al momento de recorrerlo.

        System.out.println("Ejemplo con HashMap");
        System.out.println("");

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(15, "Ramos");
        map.put(3, "Pique");
        map.put(5, "Puyol");
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");
        map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");
        map.put(6, "Iniesta");
        map.put(7, "Villa");

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }

    public void getLinkedHashMap() {
        
        System.out.println("Ejemplo con LinkedHashMap");
        System.out.println("");
        
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Casillas");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(3, "Pique");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(11, "Capdevila");
        linkedHashMap.put(14, "Xabi Alonso");
        linkedHashMap.put(16, "Busquets");
        linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(18, "Pedrito");
        linkedHashMap.put(6, "Iniesta");
        linkedHashMap.put(7, "Villa");
        linkedHashMap.put(2, "Rodriguez");
        
        int total = linkedHashMap.size();

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        Iterator<Integer> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }
        
        System.out.println("Elementos =>" + total);
    }
}
