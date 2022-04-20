package collection;

import java.util.*;
public class SetPractice {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    Collections.addAll(set, "hoge", "fuga", "bar", "hoge");
    // System.out.println(Collections);

    for (Iterator<String> itr = set.iterator(); itr.hasNext();) {
        System.out.println(itr.next());
    }

    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }

  }

}
