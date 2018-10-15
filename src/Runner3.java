import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Runner3 {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String brackets = sc.next();

    Arrays.stream(brackets.split("")).forEach(elem -> {
      if (!map.containsKey(elem)) map.put(elem, 0);
      else map.put(elem, map.get(elem) + 1);
    });

    System.out.println(map.values().stream().reduce(0, Integer::sum) % 2 == 0 ? "The brackets are balanced" : "The brackets are not balanced");
  }
}
