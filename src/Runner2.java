import java.util.*;

public class Runner2 {
  public static void main(String[] args) {
    Map<String, List<String>> movieDetailsMap = new HashMap<>();
    Map<Integer, Map<String, List<String>>> moviesHashMap = new HashMap<>();

    movieDetailsMap.put("Marvel Studios", Arrays.asList("Iron Man 3", "Thor: The dark World"));
    movieDetailsMap.put("The wolverine", Collections.singletonList("20th Century Fox"));

    moviesHashMap.put(2012, movieDetailsMap);

    System.out.println(moviesHashMap.get(2012).get("Marvel Studios"));

  }
}
