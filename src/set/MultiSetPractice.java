package set;
import java.util.*;
import com.google.common.collect.*;

public class MultiSetPractice {

	public static void main(String[] args) {

    List<String> words = Lists.newArrayList("hello", "dog", "cat", "red", "hello", "hello", "dog", "blue", "blue");
    // how to count the number of the element in arrayList without multiSet
    Map<String, Integer> counts = new HashMap<>();
    for (String word : words) {
        Integer count = counts.get(word);
        if (count == null) {
            counts.put(word, 1);
        } else {
            counts.put(word, count + 1);
        }
    }
    System.out.println("hello Number of occurrences: " + counts.get("hello"));
    System.out.println("dog Number of occurrences: " + counts.get("dog"));
    System.out.println("cat Number of occurrences: " + counts.get("cat"));

    // with multiSet
    List<String> multiSet = Lists.newArrayList("hello", "dog", "cat", "red", "hello", "hello", "dog", "blue", "blue");
    Multiset<String> wordMultiSet = HashMultiset.create(multiSet);

    System.out.println("hello Number of occurrences: " + wordMultiSet.count("hello"));
    System.out.println("dog Number of occurrences: " + wordMultiSet.count("dog"));
    System.out.println("cat Number of occurrences: " + wordMultiSet.count("cat"));


	}

}
