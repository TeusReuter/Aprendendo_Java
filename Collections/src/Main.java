import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<String> words = List.of("Apple", "Banana", "Pinneapple");
//        System.out.println(words.size());
//        System.out.println(words.isEmpty());
//        System.out.println(words.get(0));
//        System.out.println(words.contains("Apple"));
//        System.out.println(words.indexOf("Banana"));
//
//        List<String> wordsArrList = new ArrayList<String>(words);
//        List<String> wordsLinkedList = new LinkedList<String>(words);
//        List<String> wordsVector = new Vector<String>(words);
//
//        wordsArrList.add("Dog");
//        wordsArrList.add(2, "Ball");
//        wordsArrList.add("Ball");
//        System.out.println(wordsArrList);
//
//        List<String> newList = List.of("Yak", "Zebra");
//        wordsArrList.addAll(newList);
//        System.out.println(wordsArrList);
//        wordsArrList.set(5, "Fish");
//        System.out.println(wordsArrList);
//        wordsArrList.remove(2);
//        System.out.println(wordsArrList);
//        wordsArrList.remove("Banana");
//        System.out.println(wordsArrList);

//        List<String> items = List.of("Blue", "Orange", "Yellow", "White");
//        List<String> l1 = new ArrayList<String>(items);
//        List<String> l2 = new LinkedList<String>(items);
//        List<String> l3 = new Vector<String>(items);
//
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//
//        l1.add(2, "Grey");
//        l1.remove("Yellow");
//        System.out.println(l1);

//        l2.add(2, "Grey");
//        l2.remove("Yellow");
//        System.out.println(l2);
////        l2.addAll(l1);
////        System.out.println(l2);
//        l2.set(3, "Black");
//        System.out.println(l2);
//        System.out.println(l2.get(3));
//        System.out.println(l2.indexOf("Orange"));
//        System.out.println(l2.contains("Black"));

//        l3.add(2, "Grey");
//        l3.remove("Yellow");
//        System.out.println(l3);
//        l2.addAll(l1);
//        System.out.println(l2);
//        l3.set(3, "Black");
//        System.out.println(l3);
//        System.out.println(l3.get(3));
//        System.out.println(l3.indexOf("Orange"));
//        System.out.println(l3.contains("Black"));
//        ArrayList<String> all = new ArrayList<String>(l1);
//        all.addAll(l2);
//        all.addAll(l3);
//        System.out.println(all);
//        System.out.println(l2);

//        List<String> words = List.of("Apple", "Bat", "Cat");
//        System.out.println(words);
//
//        for(String word:words)
//            System.out.println(word);
//
//        Iterator wordsInterator = words.iterator();
//
//        while(wordsInterator.hasNext())
//            System.out.println(wordsInterator.next());

//        List<String> words = List.of("Apple", "Bat", "Cat");
//        List<String> wordsAL = new ArrayList<>(words);

        //Should I use ArrayList or LinkedList?
        //ArrayList provides constant time for search operation, so it is better to use ArrayList if searching is more frequent operation than add and remove operation.
        //The LinkedList provides constant time for add and remove operations. So it is better to use LinkedList for manipulation.

        // quando precisa remover ou adicionar itens, é melhor usar o iterator, se for só pra printar, dá pra usar o for

//        Iterator<String> iterator = wordsAL.iterator();

//         forma de fazer com iterator

//        while(iterator.hasNext())
//                if(iterator.next().endsWith("at"))
//                    iterator.remove();
//        System.out.println(wordsAL);

//        for(String word: words)
//            if(word.endsWith("at"))
//                System.out.println(word);

// IMPORTANTE**************
// não dá pra adicionar valores primitivos, eles são afetados pelo auto boxing

        // autoboxing, wrapper
//    List value = List.of("A", 'A', 1, 1.0);
//     o próprio java está criando um wrapper, o quê está acontecendo é o seguinte:
//    value.get(1) instanceof Character
//    value.get(2) instanceof Integer
//    value.get(3) instanceof Double

//  quando quero lista tipada, tem que passar o tipo(conceito se chama generalização):
//    List<String> Textvalues = List.of("A", "B");
//
//    List<Integer> numbers = List.of(101, 102, 103, 104, 105);
//    System.out.println(numbers.indexOf(101));
//
//    List<Integer> numbersArrList = new ArrayList<>(numbers);
//    System.out.println(numbers.indexOf(101));
    // 101 tá sofrendo autoboxing
    // 101 é object
    // numbersArrList.remove(101);
    // System.out.println(numbersArrList);
    // numbersArrList.remove(Integer.valueOf(101));
    // TÁ RECEBENDO O INDEX
//    numbersArrList.remove(Integer.valueOf(101));
//    System.out.println(numbersArrList);

        List<Integer> numbers = List.of(123, 12, 3, 45);
        List<Integer> numbersAL = new ArrayList<>(numbers);
        Collections.sort(numbersAL);
        System.out.println(numbersAL);

    }
}