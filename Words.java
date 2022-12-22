package JavaCore2022.lesson_4;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("factory", "city", "photo", "wolf", "wife", "knife", "wife", "photo",
                "tomato", "knife", "hero", "wife", "photo", "man", "bike", "photo");
        System.out.println("Исходный список:");
        words.forEach(System.out::println);

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);
    }
}

