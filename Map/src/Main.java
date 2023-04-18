import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

//        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 6);

//        System.out.println(map);
//        System.out.println(map.get("Z"));
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsKey("A"));
//        System.out.println(map.containsValue(3));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

//        Map<String, Integer> hashMap = new HashMap<>(map);
//        System.out.println(hashMap.put("F", 5));
//        System.out.println(hashMap.get("F"));
//        System.out.println(hashMap);

        // *****HASHMAP*****
        // perde tanto a ordem natural quanto a ordem de inserção
        // mas é mais eficiente
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Z", 5);
//        hashMap.put("A", 15);
//        hashMap.put("F", 25);
//        hashMap.put("L", 250);
//        System.out.println(hashMap);

        //*****LinkedHashMap*****
        // armazena pela ordem de inserção(ordem das chaves armazenadas)
//        LinkedHashMap <String, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("F", 25);
//        linkedHashMap.put("A", 15);
//        linkedHashMap.put("Z", 5);
//        linkedHashMap.put("L", 250);
//        System.out.println(linkedHashMap);

        //*****TREEMAP*****
        // Ordem natural das chaves
//        TreeMap <String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("A", 15);
//        treeMap.put("F", 25);
//        treeMap.put("Z", 5);
//        treeMap.put("L", 250);
//        System.out.println(treeMap);

        // exercises
//        String str = "This is an awesome occasion. "
//                + "This has never happened before.";

        // with char
//        Map<Character, Integer> occurances = new HashMap<>();
//        char[] chars = str.toCharArray();
//
//        for(char c: chars){
//
//            Integer integer = occurances.get(c);
//            if(integer == null) {
//              occurances.put(c, 1);
//            } else {
//                occurances.put(c, integer + 1);
//            }
//        }
//        System.out.println(occurances);

        // with String
//        Map<String, Integer> strOccurances = new HashMap<>();
//        String[] words = str.split(" ");
//
//        for(String word: words) {
//            word = word.replace(".", "");
//            Integer integer = strOccurances.get(word);
//            if(integer == null) {
//                strOccurances.put(word, 1);
//            } else {
//                strOccurances.put(word, integer + 1);
//            }
//        }
//        System.out.println(strOccurances);

        TreeMap <String, Integer> treeMap = new TreeMap<>();
        treeMap.put("F", 25);
        treeMap.put("Z", 5);
        treeMap.put("L", 250);
        treeMap.put("A", 15);
        treeMap.put("B", 25);
        treeMap.put("G", 25);

        System.out.println(treeMap);

        // next key after B
        System.out.println(treeMap.higherKey("B"));
        // maior ou igual a b
        System.out.println(treeMap.ceilingKey("B"));
        // lower <
        System.out.println(treeMap.lowerKey("B"));
        // floor <=
        System.out.println(treeMap.floorKey("B"));
        // first
        System.out.println(treeMap.firstEntry());
        // last
        System.out.println(treeMap.lastEntry());

        // subMap(between) >=
        System.out.println(treeMap.subMap("C", "Y"));
        System.out.println(treeMap.subMap("B", "Z"));
        // to include z
        System.out.println(treeMap.subMap("B", true, "Z", true));
    }
}