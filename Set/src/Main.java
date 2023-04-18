import java.util.*;

public class Main {
    public static void main(String[] args) {

        // HashSet e LinkedHashSet tem as mesmas operções
        // presentes em uma Collection


//        Set<String> set = Set.of("Apple", "Banana", "Kiwi");
//        Set<String> hashSet = new HashSet<>(set);
//        System.out.println(set);
//        System.out.println(hashSet);

        // em hashset, são inseridos em ordem aleatoria, ordem não importa
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(789121);
//        numbers.add(78912);
//        numbers.add(7891);
//        numbers.add(789);
//        numbers.add(78);
//        numbers.add(7);
//        System.out.println(numbers);

        // elementos são armazenados na ordem de inserção
//        Set<Integer> numbers = new LinkedHashSet<>();
//        numbers.add(789121);
//        numbers.add(78912);
//        numbers.add(7891);
//        numbers.add(789);
//        numbers.add(78);
//        numbers.add(7);
//        numbers.add(7898541);
//        numbers.add(7);
//        System.out.println(numbers);

        // TREE SET ordena na ordem de classificação
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(789121);
//        numbers.add(78912);
//        numbers.add(7891);
//        numbers.add(789);
//        numbers.add(78);
//        numbers.add(7);
//        numbers.add(7898541);
//        System.out.println(numbers);


        // Exercícios

        // achar os caracteres únicos
        // armazenar na ordem de classificação
//        List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
//        Set<Character> treeOfChars = new TreeSet<>(chars);
//        System.out.println(treeOfChars);
//
//        // armazenar na ordem de inserção
//        Set<Character> linkedHash = new LinkedHashSet<>(chars);
//        System.out.println(linkedHash);
//
//        // se não importar a ordem
//        // hashSet é o mais eficiente
//        Set<Character> hash = new HashSet<>(chars);
//        System.out.println(hash);
//
//        // TREESET
//        TreeSet<Integer> nTreeSet = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
//        System.out.println(nTreeSet);
//        // abaixo de 40
//        System.out.println(nTreeSet.floor(40));
//        System.out.println(nTreeSet.floor(34));
//        // menores que 34
//        System.out.println(nTreeSet.lower(34));
//        // numero superior ao 34
//        System.out.println(nTreeSet.ceiling(34));
//        // numero superior ao 36
//        System.out.println(nTreeSet.ceiling(36));
//        // maior que 34
//        System.out.println(nTreeSet.higher(34));
//        // entre 20 e 80
//        // pra baixo é inclusivo(tras todos que atendem a condição), pra cima não
//        System.out.println(nTreeSet.subSet(20, 80));
//
//        System.out.println(nTreeSet.subSet(34, 54));
//        System.out.println(nTreeSet.subSet(34, 65));
//        System.out.println(nTreeSet.subSet(34, true, 65, true));
//        System.out.println(nTreeSet.subSet(34, false, 65, false));
//        System.out.println(nTreeSet.headSet(50));
//        System.out.println(nTreeSet.tailSet(50));

        // QUEUE É PRA QUANDO QUISER ORGANIZAR AS COISAS NA ORDEM QUE DESEJA PROCESSAR ELAS
        // padrão é em ordem ascendente

//        Queue<String> queue = new PriorityQueue<>();
//        queue.offer("Apple");
//        queue.addAll((List.of("Zebra", "Monkey", "Cat")));
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);

        // vai ordenar por ordem alfabética
        Queue<String> q = new PriorityQueue<>(new StringLengthComparator());
        q.addAll((List.of("Zebra", "Monkey", "Cat")));
        System.out.println(q);
        System.out.println(q.poll());
    }
}