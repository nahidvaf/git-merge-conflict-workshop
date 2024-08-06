import java.util.Arrays;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {
    printListAsUpperCase(Arrays.asList
                         (new String[]{"AbbA", "Europe", "Ace of Base"})
                         );
  }

  public static void printListAsUpperCase(List<String> list) {
    for (String elem : list) {
      System.out.println(elem.toUpperCase());
    }
  }
}
